package com.bangdna.main.entity.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: bangbangtuan-outsourcing-back-end
 * @author: Abel Lee
 * @create: 2019-01-03 14:24
 **/

@Data
public class GroupVo implements Serializable {
    private static final long serialVersionUID = -4093270960311557285L;

    private Long id;

    private String name;

    private String skill;

    private String introduction;
    
}
