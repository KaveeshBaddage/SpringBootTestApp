package com.kaveesh.testApp.configuration;

import com.kaveesh.testApp.filter.RequestAuditInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/*
* This class holds configuration related to all interceptors in application
* */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Autowired
    RequestAuditInterceptor requestAuditInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(requestAuditInterceptor);
    }
}
