package com.find.service;

import com.find.pojo.FindOwner;

import java.util.List;

public interface FindOwnerService {

    public List<FindOwner> sortByPubtime(); 
    
    
    public String selectData();
}
