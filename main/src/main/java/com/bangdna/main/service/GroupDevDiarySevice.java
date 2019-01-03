package com.bangdna.main.service;

import com.bangdna.main.common.vo.PageResult;

/**
 * @program: bangbangtuan-outsourcing-back-end
 * @author: Abel Lee
 * @create: 2019-01-03 19:43
 **/

public interface GroupDevDiarySevice {

    /**
     * 查询团队日记列表
     */
    PageResult findGroupDiaryListByPageByUpdateTimeSort(Integer page, Integer size);

}
