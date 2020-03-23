//package com.js.config.handlerinterceptor;
//
//
//import com.js.util.TokenUtil;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.Map;
//
///**
// * @Author 姜爽
// * @Date 2019/12/3
// * @Description  拦截器设置 实现token拦截访问
// */
//@Component
//@Configuration
//public class MyHandlerIntercepter implements HandlerInterceptor {
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
//            throws Exception {
//        return true;
//    }
//    @Override
//    public void postHandle(HttpServletRequest request,
//                           HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//
//    }
//
//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
//                                Object handler, Exception ex) throws Exception {
//
//    }
//
//
//    private void returnJson(HttpServletResponse response, String json) throws Exception {
//        PrintWriter writer = null;
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html; charset=utf-8");
//        try {
//            writer = response.getWriter();
//            writer.print(json);
//
//        } catch (IOException e) {
//        } finally {
//            if (writer != null) {
//                writer.close();
//            }
//        }
//    }
//
//}
