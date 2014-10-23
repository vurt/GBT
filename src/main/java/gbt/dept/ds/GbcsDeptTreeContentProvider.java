package gbt.dept.ds;

import gbt.dept.Department;
import gbt.opt.Option;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.chinacreator.c2.dao.Dao;
import com.chinacreator.c2.dao.DaoFactory;
import com.chinacreator.c2.web.ds.TreeContentProvider;
import com.chinacreator.c2.web.ds.TreeContext;
import com.chinacreator.c2.web.ds.TreeNode;
import com.chinacreator.c2.web.ds.impl.DefaultTreeNode;

public class GbcsDeptTreeContentProvider implements TreeContentProvider {

	@Override
	public TreeNode[] getElements(TreeContext ctx) {
		Dao<Option> optionDao=DaoFactory.create(Option.class);
		Dao<Department> deptDao=DaoFactory.create(Department.class);
		List<DefaultTreeNode> nodes=new ArrayList<DefaultTreeNode>();
		if(!ctx.getConditions().containsKey("id")){
			//根节点，四个干部处室
			Option condition=new Option();
			condition.setOptionType("gscs");
			List<Option> options=optionDao.select(condition);
			
			for(Option option:options){
				DefaultTreeNode treeNode=new DefaultTreeNode(String.valueOf(option.getOptionId()), option.getOptionName());
				
				Department isParentCondition=new Department();
				isParentCondition.setDptBelo(option.getOptionId());
				
				treeNode.setIsParent(deptDao.count(isParentCondition)>0);
				nodes.add(treeNode);
			}
		}else{
			Integer pid=Integer.valueOf(ctx.getConditions().get("id").toString());
			
			Department parentDepartment=new Department();
			parentDepartment.setDptBelo(pid);
			
			List<Department> departments=deptDao.select(parentDepartment);
			for(Department department:departments){
				nodes.add(new DefaultTreeNode(department.getUpDptId().toString(), department.getDptId().toString(), department.getNameAll(), true));
			}
			Map<String, String> isParentCond=new HashMap<String, String>();
			for(DefaultTreeNode node:nodes){
				isParentCond.put("dptBelo", node.getId());
				node.setIsParent(deptDao.count(isParentCond)>0);
			}
		}
		return nodes.toArray(new TreeNode[nodes.size()]);
	}

}
