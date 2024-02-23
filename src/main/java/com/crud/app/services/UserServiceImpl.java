package com.crud.app.services;

import com.crud.app.entity.UserLogin;
import com.crud.app.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.Optional;

@Service
@Getter
@Setter
@AllArgsConstructor
public class UserServiceImpl implements UserServices {
    private UserRepository userRepository;
    HashMap<String, Object> dates;
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
    public Optional<UserLogin> updateUser(@RequestBody UserLogin user) {
        Optional<UserLogin> exist = userRepository.findById(user.getId());
        dates = new HashMap<>();
        if (user.getId() != null && exist.isPresent()) {
            userRepository.save(user);
            dates.put("UPDATE", "Updated data");
            return Optional.of(userRepository.save(user));
        }
        dates.put("ERROR", "Could not update data");
        return Optional.of(userRepository.save(user));
    }

    @Override
    public String deleteUser(Integer id) {
        return null;
    }
}
