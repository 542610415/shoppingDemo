package com.example.springbootdemo.controller;

import com.example.springbootdemo.pojo.User;
import com.example.springbootdemo.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class LoginController {
    @Resource
    private LoginService loginService;

    /**
     * 跳转登录页面
     * @return
     */
    @RequestMapping("/toLogin")
    @ResponseBody
    public String toLogin(){

        return "";
    }

    /**
     * 登录
     * @return
     */
    @RequestMapping("/login")
    @ResponseBody
    public User login(User userInfo){
        return userInfo;
    }


}
