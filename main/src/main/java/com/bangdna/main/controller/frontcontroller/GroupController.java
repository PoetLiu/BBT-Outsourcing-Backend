package com.bangdna.main.controller.frontcontroller;

import com.bangdna.main.common.entity.RestfulEntity;
import com.bangdna.main.entity.vo.GroupDetailVo;
import com.bangdna.main.entity.vo.GroupVo;
import com.bangdna.main.service.GroupDevDiarySevice;
import com.bangdna.main.service.GroupService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import com.bangdna.main.exception.CommonException;
import com.bangdna.main.exception.ExceptionEnum;

/**
 * @program: bangbangtuan-outsourcing-back-end
 * @author: Abel Lee
 * @create: 2019-01-03 13:47
 **/

@RestController
@RequestMapping("/group")
@Api(value = "group", description = "团队接口")
public class GroupController {

    private final GroupService groupService;

    private final GroupDevDiarySevice groupDevDiarySevice;

    @Autowired
    public GroupController(GroupService groupService, GroupDevDiarySevice groupDevDiarySevice) {
        this.groupService = groupService;
        this.groupDevDiarySevice = groupDevDiarySevice;
    }


    @GetMapping("/list")
    @ApiOperation("首页团队的展示，按照数据库内的order的排序，查找出2个团队列表")
    public ResponseEntity<List<GroupVo>> groupList(){
        return ResponseEntity.ok(groupService.findGroupList());
    }


    @GetMapping("/{id}")
    @ApiOperation("通过id查询团队详情")
    public RestfulEntity<GroupDetailVo> findGroupDetail(
            @ApiParam(name = "id", value = "团队id", required = true) @PathVariable Long id){
        GroupDetailVo data = null;
        try {
             data = groupService.findGroupDetailByGroupId(id);
        } catch (Exception e) {
            e.printStackTrace();
            if (e instanceof CommonException) {
                ExceptionEnum en = ((CommonException)e).getExceptionEnum();
                return RestfulEntity.getFailure(en.getCode(), en.getMsg(), null);
            }
        }
        return RestfulEntity.getSucess(data);
    }

    @GetMapping("/detail/list")
    @ApiOperation("开发日记列表")
    public ResponseEntity findGroupDiaryList(
            @RequestParam @ApiParam(value = "当前页码") Integer page,
            @RequestParam @ApiParam(value = "每页显示数量") Integer size){
        return ResponseEntity.ok(groupDevDiarySevice.findGroupDiaryListByPageByUpdateTimeSort(page, size));
    }
}
