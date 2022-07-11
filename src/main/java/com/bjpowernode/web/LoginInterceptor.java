package com.bjpowernode.web;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    /**
     *
     *
     *
     * @param request
     * @param response
     * @param handler 被拦截器的控制对象
     * @return boolean
     *  true:请求可以被controller处理
     *  false：请求被截断
     * @throws Exception
     *
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        System.out.println("执行了LoginInterceptor");
        return true;
    }
}
