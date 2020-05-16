package com.icebns.dao;

import com.icebns.pojo.User;

public interface UserDao {
    public User getUser(String userName,String password,Integer userType);
    public User getUserByUsername(String username);
}
