package com.crud.app.controller;

import com.crud.app.entity.UserLogin;
import com.crud.app.services.UserServices;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("user")
public class UserController {
    private final UserServices userServices;

    @PostMapping
    public ResponseEntity<String> saveUser(@RequestBody UserLogin userLogin){
        String returnMessage = userServices.saveUser(userLogin);
        return ResponseEntity.status(HttpStatus.CREATED).body(returnMessage);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<UserLogin>> findUserById(@PathVariable Integer id){
        Optional<UserLogin> userLogin = userServices.findUserById(id);
        return ResponseEntity.status(HttpStatus.OK).body(userLogin);
    }

}
