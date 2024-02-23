package com.crud.app.services;

import com.crud.app.entity.UserLogin;
import com.crud.app.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Getter
@Setter
@AllArgsConstructor
public class UserServiceImpl implements UserServices {
    private UserRepository userRepository;
    @Override
    public String saveUser(UserLogin user) {
        userRepository.save(user);
        return "Usuario almacenado correctamente con el ID: " + user.getId();
    }

    @Override
    public Optional<UserLogin> findUserById(Integer id) {
        return userRepository.findById(id);
    }

    @Override
    public Optional<UserLogin> updateUser(UserLogin user) {
        return Optional.empty();
    }

    @Override
    public String deleteUser(Integer id) {
        return null;
    }
}
