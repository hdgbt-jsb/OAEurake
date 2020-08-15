package com.js.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: 扫描服务路径并加载
 * @Date: 2018/10/27
 * @author: cxd
 */
@Configuration
@EnableFeignClients(basePackages = {"com.js.feignclient"})
public class FeignClientConfiguration {
}
