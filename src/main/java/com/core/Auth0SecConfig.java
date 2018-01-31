package com.core;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import com.auth0.spring.security.api.JwtWebSecurityConfigurer;

public class Auth0SecConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		JwtWebSecurityConfigurer.forRS256("http://localhost:8080/auth0eg", "https://webcome.auth0.com/").configure(http)
				.authorizeRequests().antMatchers("/sapi/**").fullyAuthenticated();
	}
}
