package com.softeem.ssm.service;

import com.softeem.ssm.pojo.User;

import java.util.List;

public interface UserService {
    List<User> login(String email, String password);

    void register(User user);



}
