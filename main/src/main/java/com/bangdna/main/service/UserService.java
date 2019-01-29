package com.bangdna.main.service;

import com.bangdna.main.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Optional<User> getByUsername(String username);

    List<User> findAll();
}
