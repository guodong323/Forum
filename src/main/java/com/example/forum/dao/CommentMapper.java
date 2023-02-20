package com.example.forum.dao;

import com.example.forum.entity.Comment;

import java.util.List;

public interface CommentMapper {
    /**
     * 根据id查询评论
     * @param id
     * @return
     */
    Comment selectCommentById(int id);

    /**
     * 根据评论目标（类别，id）对评论进行分页查询
     * @param entityType
     * @param entityId
     * @param offset
     * @param limit
     * @return
     */
    List<Comment> selectCommentByEntity(int entityType, int entityId, int offset, int limit);

    /**
     * 查询评论的数量
     * @param entityType
     * @param entityId
     * @return
     */
    int selectCountById(int entityType, int entityId);

    /**
     * 添加评论
     * @param comment
     * @return
     */
    int insertComment(Comment comment);

    /**
     * 分页查询某个用户的评论/回复列表
     * @param userId
     * @param offset
     * @param limit
     * @return
     */
    List<Comment> selectCommentByUserId(int userId, int offset, int limit);

    /**
     * 查询某个用户的评论/回复数量
     * @param userId
     * @return
     */
    int selectCommentCountByUserId(int userId);

}
