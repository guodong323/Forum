package com.example.forum.service;

import com.example.forum.dao.CommentMapper;
import com.example.forum.util.ForumConstant;
import org.springframework.beans.factory.annotation.Autowired;

public class CommentService implements ForumConstant {

    @Autowired
    private CommentMapper commentMapper;


}
