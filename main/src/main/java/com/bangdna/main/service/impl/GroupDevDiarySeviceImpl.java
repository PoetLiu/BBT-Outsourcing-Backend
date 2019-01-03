package com.bangdna.main.service.impl;

import com.bangdna.main.common.vo.PageResult;
import com.bangdna.main.entity.GroupDevDiary;
import com.bangdna.main.entity.vo.GroupDetailVo;
import com.bangdna.main.entity.vo.GroupDevDiaryVo;
import com.bangdna.main.repository.DevDiaryRepository;
import com.bangdna.main.service.GroupDevDiarySevice;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: bangbangtuan-outsourcing-back-end
 * @author: Abel Lee
 * @create: 2019-01-03 20:28
 **/

@Service
public class GroupDevDiarySeviceImpl implements GroupDevDiarySevice {

    private final DevDiaryRepository devDiaryRepository;

    @Autowired
    public GroupDevDiarySeviceImpl(DevDiaryRepository devDiaryRepository) {
        this.devDiaryRepository = devDiaryRepository;
    }

    @Override
    public PageResult<List<GroupDevDiaryVo>> findGroupDiaryListByPageByUpdateTimeSort(Integer page, Integer size) {

        Pageable pageable = PageRequest.of(page - 1, size, new Sort(Sort.Direction.DESC, "updateTime"));
        Page<GroupDevDiary> result = devDiaryRepository.findAll(pageable);

        List<GroupDevDiaryVo> groupDevDiaryVoList = new ArrayList<>();

        for (GroupDevDiary groupDevDiary : result.getContent()) {
            GroupDevDiaryVo groupDevDiaryVo = new GroupDevDiaryVo();
            BeanUtils.copyProperties(groupDevDiary, groupDevDiaryVo);
            groupDevDiaryVoList.add(groupDevDiaryVo);
        }

        return new PageResult(result.getTotalElements(), result.getTotalPages(), groupDevDiaryVoList);
    }
}
