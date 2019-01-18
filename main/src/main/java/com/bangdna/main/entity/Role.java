package com.bangdna.main.entity;

import com.bangdna.main.common.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import java.util.Set;

@Entity
@Table(name = "bbt_role")
public class Role extends BaseEntity  {
    private String name;

    @ManyToMany(mappedBy = "bbt_roles")
    private Set<User> users;
}
