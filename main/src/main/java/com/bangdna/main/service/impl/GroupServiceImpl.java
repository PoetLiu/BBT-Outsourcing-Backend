package com.bangdna.main.service.impl;

import com.bangdna.main.entity.Group;
import com.bangdna.main.entity.Member;
import com.bangdna.main.entity.vo.GroupDetailVo;
import com.bangdna.main.entity.vo.GroupVo;
import com.bangdna.main.exception.CommonException;
import com.bangdna.main.repository.GroupRepository;
import com.bangdna.main.repository.MemberRepository;
import com.bangdna.main.service.GroupService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

import static com.bangdna.main.exception.ExceptionEnum.GROUP_INFO_NOT_FOUND;

/**
 * @program: bangbangtuan-outsourcing-back-end
 * @author: Abel Lee
 * @create: 2019-01-03 13:50
 **/

@Service
@Slf4j
public class GroupServiceImpl implements GroupService {

    private final GroupRepository groupRepository;

    private final MemberRepository memberRepository;

    @Autowired
    public GroupServiceImpl(GroupRepository groupRepository, MemberRepository memberRepository) {
        this.groupRepository = groupRepository;
        this.memberRepository = memberRepository;
    }


    @Override
    public List<GroupVo> findGroupList() {

        List<Group> groupList = groupRepository.findTwoGroups();
        List<GroupVo> groupVoList = new ArrayList<>();

        if (CollectionUtils.isEmpty(groupList)) {
            log.error("未查询到首页显示的团队信息");
            throw new CommonException(GROUP_INFO_NOT_FOUND);
        }

        for (Group group : groupList) {
            GroupVo groupVo = new GroupVo();
            BeanUtils.copyProperties(group, groupVo);
            groupVoList.add(groupVo);
        }

        return groupVoList;
    }

    @Override
    public GroupDetailVo findGroupDetailByGroupId(Long id) {
        Group group;
        try {
            group = groupRepository.findById(id).get();
        } catch (Exception e) {
            throw new CommonException(GROUP_INFO_NOT_FOUND);
        }

        GroupDetailVo groupDetailVo = new GroupDetailVo();
        groupDetailVo.setId(group.getId());
        groupDetailVo.setName(group.getName());
        groupDetailVo.setSkill(group.getSkill());

        List<Member> members = memberRepository.findMemberByGroupId(id);
        if (CollectionUtils.isEmpty(members)) {
            log.error("通过团队id查询到的成员列表为空 id = #{}", id);
            return groupDetailVo;
        }

        List<String> groupMemberNames = new ArrayList<>();
        members.forEach(p -> groupMemberNames.add(p.getUsername()));
        groupDetailVo.setMember(groupMemberNames);

        return groupDetailVo;
    }
}
