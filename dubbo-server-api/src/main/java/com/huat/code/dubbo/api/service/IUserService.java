package com.huat.code.dubbo.api.service;

import com.huat.code.dubbo.api.bean.User;

import java.util.List;

/**
 * @Author LiuJin
 * @Date：Create in 2020-11-16 14:42
 * @Description 用户服务类接口
 */
public interface IUserService {


    List<User> getUserList();
}
