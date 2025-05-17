package com.eyteam.animal_shelter.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")  // Allow all routes
                        .allowedOrigins("http://localhost:5320")  // Frontend URL
                        .allowedMethods("*")                     // Allow all HTTP methods
                        .allowedHeaders("*");
            }
        };
    }
}
