package com.bangdna.main.entity;

import com.bangdna.main.common.entity.BaseEntity;
import com.fasterxml.jackson.databind.ser.Serializers;
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
@Table(name = "bbt_member")
public class Member extends BaseEntity {
    private static final long serialVersionUID = -5653150968614279927L;

    private String username;

    private String password;

    private Long groupId;
}
