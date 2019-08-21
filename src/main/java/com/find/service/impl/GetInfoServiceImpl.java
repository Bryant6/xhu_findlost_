package com.find.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.find.mapper.GetInfoMapper;
import com.find.pojo.GoodInfo;
import com.find.service.GetInfoService;

@Service
public class GetInfoServiceImpl implements GetInfoService {
	
	@Autowired
	private GetInfoMapper getInfoMapper;

	@Override
	public GoodInfo getInfoByIdGood(String id) {
		// TODO Auto-generated method stub
		return getInfoMapper.getInfoByIdGood(id);
	}

	@Override
	public GoodInfo getInfoByIdOwner(String id) {
		// TODO Auto-generated method stub
		return getInfoMapper.getInfoByIdOwner(id);
	}

	

}
