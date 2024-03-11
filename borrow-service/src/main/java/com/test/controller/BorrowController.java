package com.test.controller;

import com.test.entity.UserBorrowDetail;
import com.test.service.BorrowService;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BorrowController {
    @Resource
    BorrowService borrowService;

    @RequestMapping("/borrow/{uid}")
    public UserBorrowDetail findUserBorrows(@PathVariable int uid){
        return borrowService.getUserBorrowDetailByUid(uid);
    }

}
