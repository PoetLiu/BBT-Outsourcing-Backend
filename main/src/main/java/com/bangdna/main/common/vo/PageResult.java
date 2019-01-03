package com.bangdna.main.common.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @program: bangbangtuan-outsourcing-back-end
 * @author: Abel Lee
 * @create: 2019-01-03 20:34
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageResult<T> {

    /**
     * 总条数
     */
    private Long total;

    /**
     * 总页数
     */
    private Integer totalPage;

    /**
     * 数据
     */
    private List<T> data;

}