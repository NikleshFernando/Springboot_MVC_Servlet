package com.niklesh.app;

import org.springframework.boot.web.servlet.ServletRegistration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServletConfig {

    @Bean
    public ServletRegistrationBean<HelloServlet> regServlet(){

        return new ServletRegistrationBean<>(
                 new HelloServlet(),
                "/api/*"
                );
    }
}
