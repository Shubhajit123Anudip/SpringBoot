package com.project.Cargo.Courier.management.system.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		// Cross site request forgery (CSRF) and all user are allowed
		http.csrf().disable().authorizeHttpRequests((authorize) -> authorize.anyRequest().authenticated())
				.httpBasic(Customizer.withDefaults());

		return http.build();
	}
	
}
