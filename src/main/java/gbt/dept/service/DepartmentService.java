package gbt.dept.service;

import gbt.dept.Department;
import gbt.dept.DepartmentDraft;
import gbt.dept.exception.TempDataCopyFailedExcetpion;
import gbt.dept.exception.TempDataNotExsitExcetpion;

import java.lang.reflect.InvocationTargetException;
import java.sql.Timestamp;

import org.apache.commons.beanutils.BeanUtils;

import com.chinacreator.c2.dao.Dao;
import com.chinacreator.c2.dao.DaoFactory;

public class DepartmentService {

	/**
	 * 新增单位
	 * @param tempid 临时单位id
 	 * @return
	 */
	public static Department insertToDepartment(int tempid) {
		Dao<DepartmentDraft> tempDao=DaoFactory.create(DepartmentDraft.class);
		DepartmentDraft tempDepartment=new DepartmentDraft();
		tempDepartment.setDptId(tempid);
		DepartmentDraft allTempData=tempDao.selectOne(tempDepartment);
		if(allTempData==null){
			throw new TempDataNotExsitExcetpion(tempid);
		}
		Dao<Department> dao=DaoFactory.create(Department.class);
		Department realData=new Department();
		try {
			BeanUtils.copyProperties(realData, allTempData);
		} catch (IllegalAccessException e) {
			throw new TempDataCopyFailedExcetpion(e.getMessage(), e);
		} catch (InvocationTargetException e) {
			throw new TempDataCopyFailedExcetpion(e.getMessage(), e);
		}
		realData.setCreatedAt(new Timestamp(System.currentTimeMillis()));
		realData.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
		realData.setCreatedBy(123123);
		realData.setUpdatedBy(123);
		realData.setSelectable(true);
		realData.setCanceled(false);
		
		realData.setNamePin("自动填充");
		realData.setNameInit("自动填充");
		
		dao.insert(realData);
		tempDao.delete(allTempData);
		return realData;
	}
	
	private static int createNewId(){
		Dao<Department> dao=DaoFactory.create(Department.class);
		int maxInDept=dao.getSession().selectOne(Department.class.getName()+"Mapper.selectMaxId");
		
		Dao<DepartmentDraft> tempDao=DaoFactory.create(DepartmentDraft.class);
		int maxInTemp=tempDao.getSession().selectOne(DepartmentDraft.class.getName()+"Mapper.selectMaxId");
		
		return maxInDept>maxInTemp?maxInDept+1:maxInTemp+1;
	}
	
	
	public static synchronized DepartmentDraft initNewId(DepartmentDraft department){
		if(department!=null){
			 department.setDptId(createNewId());
		}
		 return department;
	}
}
