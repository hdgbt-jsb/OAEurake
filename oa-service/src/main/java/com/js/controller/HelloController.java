package com.js.controller;

import com.js.enums.StatusCode;
import com.js.response.BaseResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description Swagger测试controller
 * @Author jiangshuang
 */
@RestController
@Api("测试Controller")
public class HelloController {

    @GetMapping("test")
    @ApiOperation(value = "测试Controller", notes = "测试Controller")
    public BaseResponse<String> testSwagger() {
        return new BaseResponse(StatusCode.SUCCESS.getCode(),"String","String");
    }
}
