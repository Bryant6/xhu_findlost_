package com.find.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.find.mapper.FindGoodMapper;
import com.find.pojo.GoodInfo;
import com.find.service.FindGoodService;

@Service
public class FindGoodServiceImpl implements FindGoodService{
	
	@Autowired
	private FindGoodMapper findGoodMapper;

	@Override
	public List<GoodInfo> findGoodSortByPubtime(Integer page) {
		// TODO Auto-generated method stub
		return findGoodMapper.findGoodSortByPubtime(page);
	}

	@Override
	public List<GoodInfo> findGoodSortByPubtimeAndKind(String kind,Integer page) {
		// TODO Auto-generated method stub
		return findGoodMapper.findGoodSortByPubtimeAndKind(kind, page);
	}

}
