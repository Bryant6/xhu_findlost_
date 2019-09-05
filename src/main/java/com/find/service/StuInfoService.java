package com.find.service;

import org.apache.ibatis.annotations.Param;

import com.find.pojo.StuInfo;


public interface StuInfoService {

	public void insertStuInfo(StuInfo stuInfo);
	
	public void updateStuInfo(String stuName,String stuNum,String stuClass,String stuAcademy, String stuMajor,String openid1,String uploadTimes,String openid2);
}
