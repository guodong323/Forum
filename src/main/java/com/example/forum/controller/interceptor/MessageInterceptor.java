package com.example.forum.controller.interceptor;

import com.example.forum.entity.Message;
import com.example.forum.util.HostHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

public class MessageInterceptor implements HandlerInterceptor {
    @Autowired
    private HostHolder hostHolder;


}
