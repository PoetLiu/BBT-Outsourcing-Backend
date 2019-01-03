package com.bangdna.main.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 * @program: bangbangtuan-outsourcing-back-end
 * @author: Abel Lee
 * @create: 2019-01-03 17:38
 **/

@EqualsAndHashCode(callSuper = true)
@Data
public class GroupDetailVo extends GroupVo implements Serializable {

    private static final long serialVersionUID = 206024349808552395L;

    private List<String> member;
}
