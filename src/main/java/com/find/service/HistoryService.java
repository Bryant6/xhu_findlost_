package com.find.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.find.pojo.GoodInfo;

public interface HistoryService {

	public List<GoodInfo> findHistoryById(String openid1,String openid2);
}
