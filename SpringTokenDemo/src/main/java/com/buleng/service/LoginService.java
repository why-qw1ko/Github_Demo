package com.buleng.service;

import com.buleng.domain.ResponseResult;
import com.buleng.domain.User;

public interface LoginService {
    ResponseResult login(User user);

    ResponseResult logout();
}
