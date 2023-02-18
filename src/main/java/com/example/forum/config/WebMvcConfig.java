package com.example.forum.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {


    // 对静态资源以外所有路径进行拦截
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor()
    }
}
