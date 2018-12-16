package com.tt.data.service.impl;

import com.tt.data.dao.UserDao;
import com.tt.data.pojo.User;
import com.tt.data.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService{
    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;

    public void saveUser(User user) {
        userDao.save(user);
    }
}
