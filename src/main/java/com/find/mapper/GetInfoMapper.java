package com.find.mapper;

import org.apache.ibatis.annotations.Param;

import com.find.pojo.GoodInfo;

public interface GetInfoMapper {
	
	public GoodInfo getInfoByIdGood(@Param("id") String id);
	
	public GoodInfo getInfoByIdOwner(@Param("id") String id);

}
