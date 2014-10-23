package gbt.dept.ds;

import gbt.opt.Option;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.chinacreator.c2.dao.Dao;
import com.chinacreator.c2.dao.DaoFactory;
import com.chinacreator.c2.web.ds.TreeContentProvider;
import com.chinacreator.c2.web.ds.TreeContext;
import com.chinacreator.c2.web.ds.TreeNode;
import com.chinacreator.c2.web.ds.impl.DefaultTreeNode;

public class OptionsTreeContentProvider implements TreeContentProvider {

	@Override
	public TreeNode[] getElements(TreeContext ctx) {
		String optionType=(String)ctx.getConditions().get("type");
		Dao<Option> dao=DaoFactory.create(Option.class);
		Option condition=new Option();
		condition.setOptionType(optionType);
		
		List<Option> options=dao.select(condition);
		
		List<DefaultTreeNode> nodes=new ArrayList<DefaultTreeNode>(options.size());
		
		Set<String> parentids=new HashSet<String>();
		for(Option option:options){
			String parentid=String.valueOf(option.getParentId());
			parentids.add(parentid);
			nodes.add(new DefaultTreeNode(parentid, String.valueOf(option.getOptionId()), option.getOptionName(), false));
		}
		
		for(DefaultTreeNode node:nodes){
			node.setIsParent(parentids.contains(node.getId()));
		}
		
		return nodes.toArray(new TreeNode[nodes.size()]);
	}

}
