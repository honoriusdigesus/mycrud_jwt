package com.crud.app.repository;

import com.crud.app.entity.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserLogin, Integer> {
}
