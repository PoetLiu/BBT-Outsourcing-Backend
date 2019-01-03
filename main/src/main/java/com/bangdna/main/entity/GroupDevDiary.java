package com.bangdna.main.entity;

import com.bangdna.main.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

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
@Table(name = "bbt_group_dev_diary")
public class GroupDevDiary extends BaseEntity {
    private static final long serialVersionUID = -3913931678339088986L;

    private Long groupId;

    private String content;

    private Integer like;
}
