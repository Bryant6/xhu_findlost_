package com.find.service;

import com.find.pojo.StuInfo;


public interface StuInfoService {

	public void insertStuInfo(StuInfo stuInfo);
	
	public void updateStuInfo(StuInfo stuInfo,String openid);
}