package com.find.service;

import org.apache.ibatis.annotations.Param;

import com.find.pojo.GoodInfo;


public interface GetInfoService {

	public GoodInfo getInfoByIdGood(@Param("id") String id);
	
	public GoodInfo getInfoByIdOwner(@Param("id") String id);
	
}
