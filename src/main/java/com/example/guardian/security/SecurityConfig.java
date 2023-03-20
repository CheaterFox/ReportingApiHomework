package com.example.guardian.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {

        UserDetails ogut = User.builder()
                .username("ogut")
                .password("{noop}user123")
                .roles("USER")
                .build();

        UserDetails said = User.builder()
                .username("said")
                .password("{noop}manager123")
                .roles("USER","MANAGER")
                .build();

        UserDetails muhammed = User.builder()
                .username("muhammed")
                .password("{noop}admin123")
                .roles("USER","MANAGER","ADMIN")
                .build();

        return new InMemoryUserDetailsManager(ogut,said,muhammed);
    }


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(configurer ->
                configurer
                        .requestMatchers(HttpMethod.GET, "/api/v1/transaction/report").hasRole("USER")
                        .requestMatchers(HttpMethod.GET, "/api/v1/client/**").hasRole("MANAGER")
                        .requestMatchers(HttpMethod.GET, "/api/**").hasRole("ADMIN")
        );

        http.httpBasic();

        http.csrf().disable();

        return http.build();
    }

}
