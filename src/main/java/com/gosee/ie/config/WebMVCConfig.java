package com.gosee.ie.config;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/*@Configuration
@EnableWebMvc*/
public class WebMVCConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(
                "/webjars/**",
                "/img/**",
                "/css/**",
                "/js/**")
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
