package com.find.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.find.mapper.StuInfoMapper;
import com.find.pojo.StuInfo;
import com.find.service.StuInfoService;

@Service
public class StuInfoServiceImpl implements StuInfoService {
	
	@Autowired
	private StuInfoMapper stuInfoMapper;

	@Override
	public void insertStuInfo(StuInfo stuInfo) {
		// TODO Auto-generated method stub
		stuInfoMapper.insertStuInfo(stuInfo);
	}

	@Override
	public void updateStuInfo(String stuName,String stuNum,String stuClass,String stuAcademy, String stuMajor,String openid1,String uploadTimes,String openid2) {
		// TODO Auto-generated method stub
		stuInfoMapper.updateStuInfo(stuName, stuNum, stuClass, stuAcademy, stuMajor, openid1, uploadTimes, openid2);
	}

}
