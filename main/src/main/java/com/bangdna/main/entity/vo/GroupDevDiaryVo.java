package com.bangdna.main.entity.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: bangbangtuan-outsourcing-back-end
 * @author: Abel Lee
 * @create: 2019-01-03 20:13
 **/

@Data
public class GroupDevDiaryVo implements Serializable {

    private static final long serialVersionUID = -6424717651166091473L;

    private Long groupId;

    private String content;

    private Integer like;
}
