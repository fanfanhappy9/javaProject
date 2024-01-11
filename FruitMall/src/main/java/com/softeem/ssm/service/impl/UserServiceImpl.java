package com.softeem.ssm.service.impl;

import com.softeem.ssm.mapper.UserMapper;
import com.softeem.ssm.pojo.User;
import com.softeem.ssm.pojo.UserExample;
import com.softeem.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> login(String username, String password) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andPasswordEqualTo(password);
        criteria.andUsernameEqualTo(username);
        return userMapper.selectByExample(userExample);
    }

    @Override
    public void register(User user) {
        userMapper.insert(user);
    }




}
