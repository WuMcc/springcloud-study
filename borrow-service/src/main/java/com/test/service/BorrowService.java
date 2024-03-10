package com.test.service;

import com.test.entity.UserBorrowDetail;
import org.springframework.stereotype.Service;

@Service
public interface BorrowService {

    UserBorrowDetail getUserBorrowDetailByUid(int uid);
}
