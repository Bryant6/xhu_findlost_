package com.find.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.find.pojo.GoodInfo;

public interface HistoryMapper {

	
	public List<GoodInfo> findHistoryById(@Param("openid") String openid1,@Param("openid") String openid2);
}
