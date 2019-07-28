package com.find.mapper;

import com.find.pojo.GoodInfo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface FindOwnerMapper {

	public List<GoodInfo> findGoodSortByPubtime(@Param("page") Integer page);
	
	public List<GoodInfo> findGoodSortByPubtimeAndKind(@Param("kind") String kind,@Param("page") Integer page);
}
