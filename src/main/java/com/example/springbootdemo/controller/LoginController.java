package com.example.springbootdemo.controller;

import com.example.springbootdemo.pojo.User;
import com.example.springbootdemo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;


@Controller
@RequestMapping("/login")
public class LoginController {
    @Resource
    private UserService userService;

    /**
     * 初始页面
     * @return
     */
    @GetMapping("/index")
    public String index() {
        return "index.html";
    }

    /**
     * 跳转登录页面
     *
     * @return
     */
    @GetMapping("/toLogin")
    public String toLogin() {
        return "login/login.html";
    }

    /**
     * 登录拦截（简单demo级别的登录！）
     *
     * @return
     */
    @PostMapping("/login")
    public String login(String username, String password, Map<String, Object> map) {
        if (!username.equals("") && !password.equals("")) {
            User userInfo = userService.selectUserByUsername(username);

            if (!password.equals(userInfo.getPassword())) {
                map.put("msg", "用户名或密码错误！请重新输入！");
                return "login/login";
            }
            //跳转到其他页面
            return "index.html";
        }
        map.put("msg", "用户名或密码不能为空！");
        return "login/login";
    }


}
