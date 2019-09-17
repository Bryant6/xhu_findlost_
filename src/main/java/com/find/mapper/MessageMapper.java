package com.find.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.find.pojo.Message;

public interface MessageMapper {
	
	public List<Message> selectById(@Param("openid") String openid);


}
