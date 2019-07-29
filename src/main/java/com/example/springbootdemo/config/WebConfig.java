package com.example.springbootdemo.config;

import com.example.springbootdemo.common.LoginHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * 注册
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Resource
    private LoginHandlerInterceptor loginHandlerInterceptor;

    // 这个方法用来注册拦截器，拦截器需要通过这里添加注册才能生效
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // addPathPatterns("/**") 表示拦截所有的请求，
        // excludePathPatterns("/login", "/register") 表示除了登陆与注册之外，因为登陆注册不需要登陆也可以访问

//        registry.addInterceptor(loginHandlerInterceptor).addPathPatterns("/**").excludePathPatterns("/login/toLogin","\"/register\"","/login/login");

    }
}
