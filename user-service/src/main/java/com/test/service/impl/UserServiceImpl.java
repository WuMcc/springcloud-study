package com.test.service.impl;

import com.test.entity.User;
import com.test.service.UserService;
import com.test.mapper.UserMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;
    @Override
    public User getUserById(int uid) {
        return userMapper.getUserById(uid);
    }
}
