package com.find.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.find.mapper.PublishGoodMapper;
import com.find.mapper.PublishOwnerMapper;
import com.find.pojo.GoodInfo;
import com.find.service.PublishService;

@Service
public class PublishServiceImpl implements PublishService {

	@Autowired
	private PublishGoodMapper goodMapper;
	@Autowired
	private PublishOwnerMapper ownerMapper;
	
	
	@Override
	public void insertSubmitToFindGood(GoodInfo findGood) {
		// TODO Auto-generated method stub
		goodMapper.insertSubmit(findGood);
	}
	@Override
	public void insertSubmitToFindOwner(GoodInfo findOwner) {
		// TODO Auto-generated method stub
		ownerMapper.insertSubmit(findOwner);
	}

}
