package com.icebns.service;

import com.icebns.pojo.User;

public interface UserService {
    public User getUser(String userName, String password, Integer userType);
    public User getUserByUsername(String username);
}
