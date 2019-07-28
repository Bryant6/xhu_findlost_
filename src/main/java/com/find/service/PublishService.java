package com.find.service;

import com.find.pojo.GoodInfo;

public interface PublishService {

	public void insertSubmitToFindGood(GoodInfo findGood);
	
	public void insertSubmitToFindOwner(GoodInfo findGood);
	
	public String selectGoodData();
	
	public String selectOwnerData();
}
