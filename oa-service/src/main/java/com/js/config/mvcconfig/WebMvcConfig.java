package com.js.config.mvcconfig;

import com.js.config.handlerinterceptor.MyHandlerIntercepter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
/**
 * @Author jiangshuang
 * @Description 拦截未登录的操作
 **/
@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport {

    @Autowired
    private MyHandlerIntercepter myHandlerIntercepter;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myHandlerIntercepter).addPathPatterns("/**").excludePathPatterns("/userlogin");
    }

}
