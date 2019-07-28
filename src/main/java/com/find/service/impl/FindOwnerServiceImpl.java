package com.find.service.impl;

import com.find.mapper.FindOwnerMapper;
import com.find.pojo.GoodInfo;
import com.find.service.FindOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindOwnerServiceImpl implements FindOwnerService {

    @Autowired
    private FindOwnerMapper findOwnerMapper;

	@Override
	public List<GoodInfo> findGoodSortByPubtime(Integer page) {
		// TODO Auto-generated method stub
		return findOwnerMapper.findGoodSortByPubtime(page);
	}

	@Override
	public List<GoodInfo> findGoodSortByPubtimeAndKind(String kind,Integer page) {
		// TODO Auto-generated method stub
		return findOwnerMapper.findGoodSortByPubtimeAndKind(kind, page);
	}

}
