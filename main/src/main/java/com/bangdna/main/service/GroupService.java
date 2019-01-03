package com.bangdna.main.service;

import com.bangdna.main.entity.Group;
import com.bangdna.main.entity.vo.GroupDetailVo;
import com.bangdna.main.entity.vo.GroupVo;

import java.util.List;

/**
 * @program: bangbangtuan-outsourcing-back-end
 * @author: Abel Lee
 * @create: 2019-01-03 13:48
 **/

public interface GroupService {

    /**
     * 获取团队列表按照排序值取两个
     */
    List<GroupVo> findGroupList();


    /**
     * 获取团队详情，包括 团队名字， 团队成员， 团队技术栈。
     */
    GroupDetailVo findGroupDetailByGroupId(Long id);

}
