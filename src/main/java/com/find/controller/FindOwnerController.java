package com.find.controller;

import com.find.pojo.FindOwner;
import com.find.service.FindOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

import java.util.List;

@Controller
@RequestMapping("/findOwner")
public class FindOwnerController {

    @Autowired
    private FindOwnerService findOwnerService;

    @RequestMapping("/findAll")
    @ResponseBody
    public List<FindOwner> findAll() {return findOwnerService.sortByPubtime(); }
}
