package com.icebns.service;

import com.icebns.dao.UserDao;
import com.icebns.dao.UserDaoImpl;
import com.icebns.pojo.User;

public class UserServiceImpl implements UserService{
    private UserDao dao = new UserDaoImpl();
    @Override
    public User getUser(String userName, String password, Integer userType) {
        return dao.getUser(userName,password,userType);
    }

    @Override
    public User getUserByUsername(String username) {
        return dao.getUserByUsername(username);
    }

    @Override
    public int add(User user) {
        return dao.add(user);
    }

}
