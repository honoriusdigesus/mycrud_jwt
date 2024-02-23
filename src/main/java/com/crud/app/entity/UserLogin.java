package com.crud.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table
public class UserLogin {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String lastname;
    private String email;
    private String password;
    private Boolean status;
    private String role;
}
