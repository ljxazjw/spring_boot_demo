package com.bjpowernode.config;

import com.bjpowernode.web.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class MyConfig implements WebMvcConfigurer {
//    添加拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        创建拦截器的对象
        HandlerInterceptor interceptor = new LoginInterceptor();
//        指定拦截的请求url地址
        String path [] =  {"/user/**"};
//        这里指定的事不拦截的地址
        String excludePath [] = {"/user/login"};
        registry.addInterceptor(interceptor)
                .addPathPatterns(path).
                excludePathPatterns(excludePath);

    }
}
