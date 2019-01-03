package com.bangdna.main.entity;

import com.bangdna.main.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @program: bangbangtuan-outsourcing-back-end
 * @author: Abel Lee
 * @create: 2019-01-03 13:25
 **/

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "bbt_group")
public class Group extends BaseEntity {

    private static final long serialVersionUID = -8530824008486521101L;

    private String name;

    private String skill;

    private Integer order;
}
