package com.find.service;

import java.util.List;

import com.find.pojo.GoodInfo;

public interface FindOwnerService {

	public List<GoodInfo> findGoodSortByPubtime(Integer page);
	
	public List<GoodInfo> findGoodSortByPubtimeAndKind(String kind,Integer page);

}
