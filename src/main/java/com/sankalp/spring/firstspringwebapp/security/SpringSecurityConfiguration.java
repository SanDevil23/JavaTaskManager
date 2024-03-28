package com.sankalp.spring.firstspringwebapp.security;

import java.util.function.Function;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SpringSecurityConfiguration {
	// LDAP or Database
	// In Memory
	
//	InMemoryUserDetailsManager
//	InMemoryUserDetailsManager(UserDetails... users)
	
	@Bean
	public InMemoryUserDetailsManager createUserDetailsManager() {
		
		UserDetails userDetails1 = createNewUser("SanDevil23", "mnvi");																			
		UserDetails userDetails2 = createNewUser("harryBrook", "hhry");																			
		return new InMemoryUserDetailsManager(userDetails1, userDetails2);
	}

	private UserDetails createNewUser(String username, String password) {
		Function<String, String> passwordEncoder
			= input -> passwordEncoder().encode(input);
		UserDetails userDetails = org.springframework.security.core.userdetails.User.builder()
																					.passwordEncoder(passwordEncoder)
																					.username(username)
																					.password(password)
																					.roles("USER", "ADMIN")
																					.build();
		return userDetails;
	}
	
	// CREATING A CUSTOMIZED PASSWORD ENCODER
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
