package com.zb.controller;

import com.zb.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/9/10.
 */
@Controller
public class UsersController {
    @Autowired
    private UsersService usersService;

    @RequestMapping("index")
    public String hello(){
        return "backstagepages/index";
    }
    @RequestMapping("word")
    public String word(){
        return "index";
    }
}
