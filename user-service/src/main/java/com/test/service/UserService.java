package com.test.service;

import com.test.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User getUserById(int uid);

}
