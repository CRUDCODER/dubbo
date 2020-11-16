package com.huat.code.server.user.provider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author LiuJin
 * @Date：Create in 2020-11-16 14:56
 * @Description
 */
@SpringBootApplication
@EnableDubbo
public class UserProviderServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserProviderServerApplication.class,args);
    }
}
