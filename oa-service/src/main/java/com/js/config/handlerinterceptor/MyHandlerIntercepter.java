package com.js.config.handlerinterceptor;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author 姜爽
 * @Date 2019/12/3
 * @Description  拦截器设置 实现token拦截访问
 */
@Component
@Configuration
@Slf4j
public class MyHandlerIntercepter implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        return true;
    }
    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response, Object handler, ModelAndView modelAndView){
        log.info("Controller方法处理完之后，DispatcherServlet进行视图的渲染之前");
        throw new UnsupportedOperationException("postHandle执行失败");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
                                Object handler, Exception ex){
        log.info("多用于清理资源");
        throw new UnsupportedOperationException("afterCompletion执行失败");
    }
}
