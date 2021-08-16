package com.jacky.Dao;

import com.jacky.Entity.User;

import java.util.List;

public interface Dao {
    void add(User user);
    void update(User user);
    void delete(String id);
    User queryById(String id);
    List<User> queryAll();
}
