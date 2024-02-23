package com.crud.app.services;

import com.crud.app.entity.UserLogin;

import java.util.Optional;

public interface UserServices {
    String saveUser(UserLogin user);
    Optional<UserLogin> findUserById(Integer id);
    Optional<UserLogin> updateUser(UserLogin user);
    String deleteUser(Integer id);

}
