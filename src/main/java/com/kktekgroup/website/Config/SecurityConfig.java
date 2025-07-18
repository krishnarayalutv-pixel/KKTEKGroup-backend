package com.kktekgroup.website.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
      http.
      authorizeHttpRequests((requests) -> requests
            .requestMatchers("/Admin/*").authenticated()
                .requestMatchers( "/contact").permitAll());
      http.csrf(csrf-> csrf.disable());
        return http.build();
    
            }
    
}
