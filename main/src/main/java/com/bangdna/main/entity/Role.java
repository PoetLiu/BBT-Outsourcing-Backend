package com.bangdna.main.entity;

import com.bangdna.main.common.entity.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "bbt_role")
public class Role extends BaseEntity {
    private String name;

    //@ManyToMany(mappedBy = "roles")
    //private Set<User> users;
}
