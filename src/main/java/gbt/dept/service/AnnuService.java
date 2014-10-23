package gbt.dept.service;

import java.sql.Timestamp;

import gbt.dept.AnnuDeptInfo;

public class AnnuService {
	public static AnnuDeptInfo initAnnuDeptInfo(AnnuDeptInfo info){
		info.setCreatedAt(new Timestamp(System.currentTimeMillis()));
		info.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
		info.setCreatedBy(123123);
		info.setUpdatedBy(123);
		return info;
	}
}
