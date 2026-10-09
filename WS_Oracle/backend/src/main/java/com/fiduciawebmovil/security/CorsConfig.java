package com.fiduciawebmovil.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Collections;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();

        // 1. Allow all origins (use allowedOriginPatterns instead of "*" if credentials are true)
        configuration.setAllowedOriginPatterns(Collections.singletonList("*"));

        // 2. Allow all HTTP methods (GET, POST, PUT, DELETE, OPTIONS, etc.)
        configuration.setAllowedMethods(Collections.singletonList("*"));

        // 3. Allow all headers
        configuration.setAllowedHeaders(Collections.singletonList("*"));

        // 4. Allow credentials (cookies, authorization headers)
        configuration.setAllowCredentials(true);

        // 5. Expose any specific headers if required by your client
        configuration.setExposedHeaders(Collections.singletonList("*"));

        // Register the configuration for all paths ("/**")
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);

        return source;
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOriginPatterns("*")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH", "OPTIONS", "HEAD")
                .allowedHeaders("*")
                .exposedHeaders("*")
                .allowCredentials(true)
                .maxAge(3600);
    }
}
