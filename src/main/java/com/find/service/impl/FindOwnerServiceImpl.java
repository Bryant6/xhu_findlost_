package com.find.service.impl;

import com.find.mapper.FindOwnerMapper;
import com.find.pojo.FindOwner;
import com.find.service.FindOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindOwnerServiceImpl implements FindOwnerService {

    @Autowired
    private FindOwnerMapper findOwnerMapper;

    @Override
    public List<FindOwner> sortByPubtime() {
        return findOwnerMapper.sortByPubtime();
    }

	@Override
	public String selectData() {
		// TODO Auto-generated method stub
		return findOwnerMapper.selectData();
	}
}
