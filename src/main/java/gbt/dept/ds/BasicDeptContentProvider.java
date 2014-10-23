package gbt.dept.ds;

import gbt.dept.Department;

import java.util.ArrayList;

import com.chinacreator.c2.dao.mybatis.enhance.Page;
import com.chinacreator.c2.web.ds.ArrayContentProvider;
import com.chinacreator.c2.web.ds.ArrayContext;

public class BasicDeptContentProvider implements ArrayContentProvider {

	@Override
	public Page<?> getElements(ArrayContext arg0) {
		ArrayList<Department> departments=new ArrayList<Department>();
		departments.add(new Department());
		return new Page(1, 1, 1, departments);
	}

}
