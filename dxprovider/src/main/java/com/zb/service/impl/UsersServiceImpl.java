package com.zb.service.impl;

import com.zb.service.UsersService;

/**
 * Created by Administrator on 2018/9/10.
 */
public class UsersServiceImpl implements UsersService {
    @Override
    public String sayHello(String name) {

        return "hello boys and girls "+name;
    }
}
