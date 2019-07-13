package com.seckill.service;

import com.seckill.service.model.UserModel;

public interface UserService {
    //the method to get user object through userID
    UserModel getUserById(Integer id);
}
