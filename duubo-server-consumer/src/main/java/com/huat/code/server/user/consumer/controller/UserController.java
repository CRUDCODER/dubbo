package com.huat.code.server.user.provider.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.huat.code.dubbo.api.bean.User;
import com.huat.code.dubbo.api.common.CommonResult;
import com.huat.code.dubbo.api.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author LiuJin
 * @Date：Create in 2020-11-16 14:51
 * @Description
 */
@RestController
@Slf4j
public class UserController {
    @Reference
    private IUserService userService;
    @GetMapping("/getUserList")
    public CommonResult getUserList(){
        List<User> userList = userService.getUserList();
        return CommonResult.success(userList);
    }

}
