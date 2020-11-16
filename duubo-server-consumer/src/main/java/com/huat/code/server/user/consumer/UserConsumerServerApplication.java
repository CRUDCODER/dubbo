package com.huat.code.server.user.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author LiuJin
 * @Date：Create in 2020-11-16 14:48
 * @Description
 */
@SpringBootApplication
@ComponentScan(value = "com.huat.code")
public class UserConsumerServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserConsumerServerApplication.class,args);
    }
}
