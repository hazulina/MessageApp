package com.example.messageapp;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
       registry.addViewController("/messages").setViewName("messages");
       registry.addViewController("/messages/{senderName}").setViewName("messages");
       registry.addViewController("/").setViewName("enterForm");
       registry.addViewController("/index").setViewName("index");
       registry.addViewController("/messages/add").setViewName("addForm");
    }
}
