package com.js.controller;

import com.js.enums.StatusCode;
import com.js.response.BaseResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description Swagger测试controller
 * @Author jiangshuang
 */
@RestController
@Api("测试Controller")
public class HelloController {

    @Value("${spring.datasource.url}")
    private String url;

    @GetMapping("test")
    @ApiOperation(value = "测试Controller", notes = "测试Controller")
    public BaseResponse<String> testSwagger() {

//第三种、Mapper接口方式的调用，推荐这种使用方式。
//        PageHelper.offsetPage(1, 10);
//        List<Country> list = countryMapper.selectIf(1);
        System.out.println("测试分支");
        return new BaseResponse(StatusCode.SUCCESS.getCode(),"String",url);
    }
}
