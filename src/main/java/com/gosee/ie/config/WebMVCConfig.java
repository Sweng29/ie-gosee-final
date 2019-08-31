package com.gosee.ie.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
public class WebMVCConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(
                "/admin/**",
                "/admin/images/**",
                "/admin/css/**",
                "/admin/fonts/poppins/**",
                "/admin/js/**",
                "/admin/vendor/**")
                .addResourceLocations(
                        "classpath:/static/admin/images/",
                        "classpath:/static/admin/css/",
                        "classpath:/static/admin/fonts/",
                        "classpath:/static/admin/fonts/poppins/",
                        "classpath:/static/admin/js/",
                        "classpath:/static/admin/vendor/"
                );
    }

}
