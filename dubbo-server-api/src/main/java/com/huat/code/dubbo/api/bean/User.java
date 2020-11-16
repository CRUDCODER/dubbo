package com.huat.code.dubbo.api.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author LiuJin
 * @Date：Create in 2020-11-16 14:39
 * @Description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {


    private Long userId;

    private String userName;

    private String userAccount;

    private String password;

    private String phone;

}
