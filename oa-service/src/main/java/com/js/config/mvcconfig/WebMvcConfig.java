package com.js.config.mvcconfig;

import com.js.config.handlerinterceptor.MyHandlerIntercepter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author jiangshuang
 * @Description 拦截未登录的操作
 **/
@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport {

    @Autowired
    private MyHandlerIntercepter myHandlerIntercepter;

    /**
     * 不拦截路径
     **/
    private List<String> excludePathPatterns = new ArrayList<>();

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        excludePathPatterns.add("/swagger-ui.html");
        excludePathPatterns.add("/v2/api-docs");
        registry.addInterceptor(myHandlerIntercepter).addPathPatterns("/**").excludePathPatterns(excludePathPatterns);
    }

}
