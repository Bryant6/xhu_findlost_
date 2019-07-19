package com.find.mapper;

import com.find.pojo.FindOwner;

import java.util.List;

public interface FindOwnerMapper {

    public List<FindOwner> sortByPubtime();
    
    public String selectData();
}
