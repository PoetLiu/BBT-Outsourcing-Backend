package com.bangdna.main.entity;

import com.bangdna.main.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @program: bangbangtuan-outsourcing-back-end
 * @author: Abel Lee
 * @create: 2018-12-29 23:24
 **/

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "bbt_user")
public class User extends BaseEntity {

    private static final long serialVersionUID = 2719868764830028118L;

    private String username;

    private String password;

    @ManyToMany
    @JoinTable(name = "bbt_user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();
}