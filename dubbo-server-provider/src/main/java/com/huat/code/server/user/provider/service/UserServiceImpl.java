package com.huat.code.server.user.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.huat.code.dubbo.api.bean.User;
import com.huat.code.dubbo.api.service.IUserService;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @Author LiuJin
 * @Date：Create in 2020-11-16 14:44
 * @Description
 */
@Component
@Service
public class UserServiceImpl implements IUserService {
    @Override
    public List<User> getUserList() {
        List<User> userList= Arrays.asList(new User(10001L,"张三","14864616@qq.com","16846acsad","18168468461"),
                new User(10002L,"李四","14234216@qq.com","16846a123d","18168423463"));
        return userList;
    }
}
