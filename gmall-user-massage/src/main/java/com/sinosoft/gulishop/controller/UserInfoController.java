package com.sinosoft.gulishop.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sinosoft.gulishop.entity.UserInfo;
import com.sinosoft.gulishop.service.UserInfoService;
import com.sionsoft.gulishop.result.Result;
import org.joda.time.ReadableDateTime;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author 袁宝磊
 * @since 2021-04-16
 */
@RestController
@RequestMapping("/gulishop")
public class UserInfoController {

    @Resource
    private UserInfoService userInfoService;

    @GetMapping("/findall")
    public Result findAll() {
        List<UserInfo> list = userInfoService.list(null);
        return Result.ok().data("all",list);
    }

    @GetMapping("/findbyid")
    public Result findById(String id){
        UserInfo byId = userInfoService.getById(id);
        return Result.ok().data("findById",byId);
    }

    @PostMapping("/save")
    public Result save(@RequestBody UserInfo userInfo){
        boolean save = userInfoService.save(userInfo);
        return Result.ok();
    }

    @PutMapping("/update")
    public Result update(@RequestBody UserInfo userInfo){
        boolean id = userInfoService.update(userInfo, new QueryWrapper<UserInfo>().eq("id", userInfo.getId()));
        return Result.ok();
    }

    @DeleteMapping("/deletebyid")
    public Result deleteById(String id){
        boolean flag = userInfoService.removeById(id);
        return Result.ok();
    }
}

