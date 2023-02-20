package com.example.forum.dao;

import com.example.forum.entity.DiscussPost;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DiscussPostMapper {

    /**
     * 分页查询讨论信息
     * @param userId 当传入的userId = 0时：查找所有用户的帖子
     *               当传入的userId != 0时：查找该指定用户的帖子
     * @param offset 每页的起始索引
     * @param limit  每页显示多少条数据
     * @param orderMode  排行模式（若传入1，则按照热度来排序）
     * @return
     */
    List<DiscussPost> selectDiscussPost(int userId, int offset, int limit, int orderMode);

    /**
     * 查询讨论帖子的个数
     * @param userId 当传入的userId = 0时计算所有用户的帖子总数
     *               当传入的userId != 0时计算该指定用户的帖子总数
     * @return
     */
    int selectDiscussPostRows(@Param("userId") int userId);

    /**
     * 插入/添加帖子
     * @param discussPost
     * @return
     */
    int insertDiscussPost(DiscussPost discussPost);

    /**
     * 根据id查询帖子
     * @param id
     * @return
     */
    DiscussPost selectDiscussPostById(int id);

    /**
     * 更新评论数量
     * @param id
     * @param commentCount
     * @return
     */
    int updateCommentCount(int id, int commentCount);

    /**
     * 修改帖子类型
     * @param id  0 = 普通，1 = 置顶
     * @param type
     * @return
     */
    int updateType(int id, int type);

    /**
     * 修改帖子状态
     * @param id  0 = 正常，1 = 精华， 2 = 拉黑
     * @param status
     * @return
     */
    int updateStatus(int id, int status);

    /**
     * 修改帖子分数
     * @param id
     * @param score
     * @return
     */
    int updateScore(int id, double score);

}
