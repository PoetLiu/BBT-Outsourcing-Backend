package com.bangdna.main.service;

import com.bangdna.main.entity.User;

import java.util.Optional;
import java.util.List;

public interface UserService {
    Optional<User> getByUsername(String username);
    List<User> findAll();
}
