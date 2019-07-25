package com.example.springbootdemo.service.impl;

import com.example.springbootdemo.SpringbootdemoApplication;
import com.example.springbootdemo.constant.StringEnum;
import com.example.springbootdemo.dao.UserMapper;
import com.example.springbootdemo.pojo.User;
import com.example.springbootdemo.service.UserService;
import org.apache.tomcat.jni.Global;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Service
public class UserServiceImpl implements UserService {
    private static final Logger LOGO = LoggerFactory.getLogger(UserServiceImpl.class);

    @Resource
    private UserMapper userMapper;

    @Override
    public User selectUserByUsername(String username) {
        try {
            User userInfo = userMapper.selectUserByUsername(username);

            //把用户信息存进session  此处可以与Redis结合（session_id）
            HttpSession session = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();
            //设置session 过期时间
            session.setMaxInactiveInterval(10 * 60);
            //存值
            session.setAttribute(StringEnum.USERINFO.getMsg(), userInfo);

            return userInfo;
        } catch (Exception e) {
            LOGO.info("Method selectUserByUsername find a Exception" + e.toString());
        }
        return null;
    }
}
