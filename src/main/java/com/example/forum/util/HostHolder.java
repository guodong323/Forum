package com.example.forum.util;

import com.example.forum.entity.User;

/**
 * 持有用户信息（多线程）用于代替session对象
 */
public class HostHolder {
    private ThreadLocal<User> users = new ThreadLocal<>();

    // 储存user
    public void setUser(User user) {
        users.set(user);
    }

    // 获取user
    public User getUser() {
        return users.get();
    }

    // 清理
    public void clear() {
        users.remove();
    }
}
