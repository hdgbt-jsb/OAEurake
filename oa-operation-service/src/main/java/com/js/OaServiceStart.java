package com.js;

import com.js.util.StartLogo;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description 启动类
 * @Author jishubu
 * @ComponentScan 测试开发时开启注解可以运行swagger
 */
@EnableEurekaClient
@SpringBootApplication
@Slf4j
@MapperScan("com.js.mapper")
public class OaServiceStart {
    public static void main(String[] args) {
        try{
            SpringApplication.run(OaServiceStart.class,args);
            log.info(StartLogo.print());
            log.info("项目启动成功");
        }catch (Exception e){
            log.info("项目启动失败");
        }

    }
}
