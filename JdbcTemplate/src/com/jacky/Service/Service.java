package com.jacky.Service;

import com.jacky.Dao.Dao;
import com.jacky.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@org.springframework.stereotype.Service
@Transactional(propagation = Propagation.REQUIRED,
        isolation = Isolation.REPEATABLE_READ,
        timeout = -1,
        readOnly = false
)
public class Service {
    @Autowired
    private Dao dao;

    public void addUser(User user) {
        dao.add(user);
    }

    public void updateUser(User user) {
        dao.update(user);
    }

    public User queryById(String id) {
        return dao.queryById(id);
    }

    public List<User> queryAll() {
        return dao.queryAll();
    }

    public void deleteById(String id) {
        dao.delete(id);
    }
}
