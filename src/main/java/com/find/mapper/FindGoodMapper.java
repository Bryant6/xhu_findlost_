package com.find.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.find.pojo.GoodInfo;

public interface FindGoodMapper {
	
	public List<GoodInfo> findGoodSortByPubtime(@Param("page") Integer page);
	
	public List<GoodInfo> findGoodSortByPubtimeAndKind(@Param("kind") String kind,@Param("page") Integer page);
}
