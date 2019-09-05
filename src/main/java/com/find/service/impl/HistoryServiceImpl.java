package com.find.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.find.mapper.HistoryMapper;
import com.find.pojo.GoodInfo;
import com.find.service.HistoryService;

@Service
public class HistoryServiceImpl implements HistoryService {

	@Autowired
	private HistoryMapper historyMapper;
	
	@Override
	public List<GoodInfo> findHistoryById(String openid1,String openid2) {
		// TODO Auto-generated method stub
		return historyMapper.findHistoryById(openid1,openid2);
	}

}
