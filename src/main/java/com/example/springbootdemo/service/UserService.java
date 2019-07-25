package com.example.springbootdemo.service;

import com.example.springbootdemo.pojo.User;


public interface UserService {
    //根据用户名查询用户
    User selectUserByUsername(String username);

}
