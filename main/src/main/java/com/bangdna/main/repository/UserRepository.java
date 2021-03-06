package com.bangdna.main.repository;

import com.bangdna.main.common.repository.BaseRepository;
import com.bangdna.main.entity.User;

import java.util.Optional;

/**
 * @program: bangbangtuan-outsourcing-back-end
 * @author: Abel Lee
 * @create: 2019-01-02 13:18
 **/

public interface UserRepository extends BaseRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
