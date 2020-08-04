package com.js;

import com.js.util.StartLogo;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description 网关启动类
 * @Author jishubu
 */
@SpringBootApplication
@Slf4j
@EnableDiscoveryClient
public class SpringBootStart {
    public static void main(String[] args) {
        try{
            SpringApplication.run(SpringBootStart.class,args);
            log.info(StartLogo.print());
            log.info("项目启动成功");
        }catch (Exception e){
            log.info("项目启动失败");
        }

    }
}
