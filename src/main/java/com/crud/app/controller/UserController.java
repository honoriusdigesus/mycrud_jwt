package com.crud.app.controller;

import com.crud.app.entity.UserLogin;
import com.crud.app.services.UserServices;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("user")
public class UserController {
    private final UserServices userServices;

    @PostMapping
    private ResponseEntity<String> saveUser(@RequestBody UserLogin userLogin){
        String returnMessage = userServices.saveUser(userLogin);
        return ResponseEntity.status(HttpStatus.CREATED).body(returnMessage);
    }
}
