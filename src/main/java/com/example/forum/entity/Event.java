package com.example.forum.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * 封装事件(用于系统通知)
 */
public class Event {
    // 事件类型
    private String topic;
    // 事件由谁触发
    private int userId;
    // 实体类型
    private int entityType;
    // 实体id
    private int entityId;
    // 实体的接收者
    private int entityUserId;
    // 存储未来可能需要用到的数据
    private Map<String, Object> data = new HashMap<>();

    public String getTopic() {
        return topic;
    }

    public Event setTopic(String topic) {
        this.topic = topic;
        return this;
    }

    public int getUserId() {
        return userId;
    }

    public Event setUserId(int userId) {
        this.userId = userId;
        return this;
    }

    public int getEntityType() {
        return entityType;
    }

    public Event setEntityType(int entityType) {
        this.entityType = entityType;
        return this;
    }

    public int getEntityId() {
        return entityId;
    }

    public Event setEntityId(int entityId) {
        this.entityId = entityId;
        return this;
    }

    public int getEntityUserId() {
        return entityUserId;
    }

    public Event setEntityUserId(int entityUserId) {
        this.entityUserId = entityUserId;
        return this;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public Event setData(String key, Object value) {
        this.data.put(key,value);
        return this;
    }
}
