package com.example.forum.config;

import com.example.forum.controller.interceptor.LoginTicketInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Autowired
    private LoginTicketInterceptor loginTicketInterceptor;



    // 对静态资源以外所有路径进行拦截
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor()
    }
}
