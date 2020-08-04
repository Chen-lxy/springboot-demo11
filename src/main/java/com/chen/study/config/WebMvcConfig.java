package com.chen.study.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // 设置登录操作
        registry.addViewController("/home").setViewName("/home");
        registry.addViewController("/index").setViewName("/");
        registry.addViewController("/login").setViewName("/login");
    }
}
