package com.huat.code.dubbo.api.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author LiuJin
 * @Date：Create in 2020-11-16 14:39
 * @Description
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CommonResult implements Serializable {

    private Integer code;

    private String msg;

    private Object data;

    public static CommonResult success(){
        return new CommonResult(200,"操作成功",null);
    }

    public static CommonResult success(String msg){
        return new CommonResult(200,msg,null);
    }

    public static CommonResult success(Object data){
        return new CommonResult(200,"操作成功",data);
    }

    public static CommonResult success(String msg,Object data){
        return new CommonResult(200,msg,data);
    }

    public static CommonResult fail(){
        return new CommonResult(500,"操作失败",null);
    }

    public static CommonResult fail(String msg){
        return new CommonResult(500,msg,null);
    }

    public static CommonResult fail(Integer code){
        return new CommonResult(code,"操作失败",null);
    }

    public static CommonResult fail(Integer code,String msg){
        return new CommonResult(code,msg,null);
    }
}
