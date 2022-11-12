package com.imikasa.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class CommonResult<T> implements Serializable {

    private int code;

    private String message;

    private T data;

    public static <T>CommonResult<T> error(CommonResult<?> result){
        return error(result.getCode(),result.getMessage());
    }

    public static <T>CommonResult<T> error(int code ,String message){
        CommonResult<T> result = new CommonResult<>();
        result.code = code;
        result.message = message;
        return result;
    }

    public static <T>CommonResult<T> success(T data){
        CommonResult<T> result = new CommonResult<>();
        result.code = 200;
        result.message = "success";
        result.data = data;
        return result;
    }

}
