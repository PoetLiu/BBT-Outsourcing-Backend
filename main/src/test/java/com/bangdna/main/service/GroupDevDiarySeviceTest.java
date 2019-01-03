package com.bangdna.main.service;

import com.bangdna.main.entity.GroupDevDiary;
import com.bangdna.main.repository.DevDiaryRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class GroupDevDiarySeviceTest {

    @Autowired
    private DevDiaryRepository devDiaryRepository;

    @Test
    public void findAllAndOrderByUpdateTimeTest(){
        Sort sort = new Sort(Sort.Direction.DESC, "updateTime");

        Pageable pageable = PageRequest.of(0, 10, sort);

        System.out.println(devDiaryRepository.findAll(pageable).getContent());
    }

}