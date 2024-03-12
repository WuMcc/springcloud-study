package com.test.controller;

import com.test.entity.User;
import com.test.service.UserService;
import javax.annotation.Resource;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope//实时刷新，远端nacos服务器配置文件发生更新，实时更新
public class UserController {
    @Resource
    UserService userService;

    @RequestMapping("/user/{uid}")
    public User getUserById(@PathVariable("uid") int uid){
        return userService.getUserById(uid);
    }
}
