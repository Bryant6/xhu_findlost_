package com.find.mapper;

import com.find.pojo.StuInfo;

public interface StuInfoMapper {

	public void insertStuInfo(StuInfo stuInfo);
	
	public void updateStuInfo(StuInfo stuInfo,String openid);
}