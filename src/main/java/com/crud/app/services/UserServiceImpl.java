package com.crud.app.services;

import com.crud.app.entity.UserLogin;
import com.crud.app.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
@Getter
@Setter
@AllArgsConstructor
public class UserServiceImpl implements UserServices {
    private UserRepository userRepository;
    @Override
    public String saveUser(UserLogin user) {
        userRepository.save(user);
        return "Usuario almacenado correctamente";
    }

    @Override
    public UserLogin findUserById(Integer id) {
        return null;
    }

    @Override
    public UserLogin updateUser(UserLogin user) {
        return null;
    }

    @Override
    public UserLogin deleteUser(Integer id) {
        return null;
    }
}
