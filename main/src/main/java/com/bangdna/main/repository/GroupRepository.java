package com.bangdna.main.repository;

import com.bangdna.main.common.repository.BaseRepository;
import com.bangdna.main.entity.Group;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

/**
 * @program: bangbangtuan-outsourcing-back-end
 * @author: Abel Lee
 * @create: 2019-01-03 13:31
 **/

public interface GroupRepository extends BaseRepository<Group, Long> {


    /**
     * 首页查找两条根据order排序的前两个团队
     */
    @Query(value = "select * from `bbt_group` order by `order` limit 2", nativeQuery = true)
    List<Group> findTwoGroups();


    Optional<Group> findById(Long id);

}
