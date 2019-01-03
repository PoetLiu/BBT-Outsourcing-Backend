package com.bangdna.main.repository;

import com.bangdna.main.common.repository.BaseRepository;
import com.bangdna.main.entity.Member;

import java.util.List;

/**
 * @program: bangbangtuan-outsourcing-back-end
 * @author: Abel Lee
 * @create: 2019-01-03 13:30
 **/

public interface MemberRepository extends BaseRepository<Member, Long> {

    /**
     * 通过团队id查询 成员列表
     */
    List<Member> findMemberByGroupId(Long id);
}
