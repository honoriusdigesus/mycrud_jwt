package com.crud.app.services;

import com.crud.app.entity.UserLogin;

public interface UserServices {
    String saveUser(UserLogin user);
    UserLogin findUserById(Integer id);
    UserLogin updateUser(UserLogin user);
    UserLogin deleteUser(Integer id);

}
