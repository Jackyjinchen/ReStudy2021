package com.jacky.Dao;

import com.jacky.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DaoImpl implements Dao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(User user) {
        String sql = "insert into t_user value(?,?,?)";
        Object[] args = {user.getUserId(),user.getUserName(),user.getUserAge()};
        int update = jdbcTemplate.update(sql,args);
        System.out.println("插入了"+update+"条数据");
    }

    @Override
    public void update(User user) {
        String sql = "update t_user set userName=?,userAge=? where userId=?";
        Object[] args ={user.getUserName(),user.getUserAge(),user.getUserId()};
        int update = jdbcTemplate.update(sql,args);
        System.out.println("修改了"+update+"条数据");
    }

    @Override
    public void delete(String id) {
        String sql = "delete from t_user where userId=?";
        int update = jdbcTemplate.update(sql,id);
        System.out.println("删除了"+update+"条数据");
    }

    @Override
    public User queryById(String id) {
        String sql = "select * from t_user where userId=?";
        User user = jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<User>(User.class),id);
        return user;
    }

    @Override
    public List<User> queryAll() {
        String sql = "select * from t_user";
        List<User> userList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class));
        return userList;
    }
}
