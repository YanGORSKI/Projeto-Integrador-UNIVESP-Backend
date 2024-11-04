package com.univesp.sistemainternoadra.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // permite todas as requisições
                .allowedOrigins("http://localhost:3006") // seu frontend
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // métodos permitidos
                .allowedHeaders("*") // permite todos os cabeçalhos
                .allowCredentials(true); // permite credenciais (cookies, headers de autenticação)
    }
}
