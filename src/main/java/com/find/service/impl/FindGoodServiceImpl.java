package com.find.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.find.mapper.FindGoodMapper;
import com.find.pojo.FindGood;
import com.find.service.FindGoodService;

@Service
public class FindGoodServiceImpl implements FindGoodService{
	
	@Autowired
	private FindGoodMapper findGoodMapper;

	@Override
	public void insertSubmit(FindGood findGood) {
		// TODO Auto-generated method stub
		findGoodMapper.insertSubmit(findGood);
	}

}
