package com.find.mapper;

import org.apache.ibatis.annotations.Param;

import com.find.pojo.StuInfo;

public interface StuInfoMapper {

	public void insertStuInfo(StuInfo stuInfo);
	
	public void updateStuInfo(@Param("stuName") String stuName,@Param("stuNum") String stuNum,@Param("stuClass") String stuClass,@Param("stuAcademy") String stuAcademy,@Param("stuMajor") String stuMajor,@Param("openid") String openid1,@Param("uploadTimes") String uploadTimes,@Param("openid") String openid2);
}
