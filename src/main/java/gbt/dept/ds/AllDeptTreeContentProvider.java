package gbt.dept.ds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import gbt.dept.Department;

import com.chinacreator.c2.dao.Dao;
import com.chinacreator.c2.dao.DaoFactory;
import com.chinacreator.c2.web.ds.TreeContentProvider;
import com.chinacreator.c2.web.ds.TreeContext;
import com.chinacreator.c2.web.ds.TreeNode;
import com.chinacreator.c2.web.ds.impl.DefaultTreeNode;

public class AllDeptTreeContentProvider implements TreeContentProvider{

	@Override
	public TreeNode[] getElements(TreeContext ctx) {
		Dao<Department> dao=DaoFactory.create(Department.class);

		Department condition=new Department();
		if(!ctx.getConditions().containsKey("id")){
			condition.setUpDptId(0);
		}else {
			int pid=Integer.parseInt((String)ctx.getConditions().get("id"));
			condition.setUpDptId(pid);
		}
		List<Department> departments=dao.select(condition);
		List<DefaultTreeNode> nodes=new ArrayList<DefaultTreeNode>();
		for(Department department:departments){
			nodes.add(new DefaultTreeNode(department.getUpDptId().toString(), department.getDptId().toString(), department.getNameAll(), true));
		}
		Map<String, String> isParentCond=new HashMap<String, String>();
		for(DefaultTreeNode node:nodes){
			isParentCond.put("upDptId", node.getId());
			node.setIsParent(dao.count(isParentCond)>0);
		}
		return nodes.toArray(new TreeNode[nodes.size()]);
	}
	
}
