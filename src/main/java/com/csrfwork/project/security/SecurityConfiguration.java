package com.csrfwork.project.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	
	 @Override
	    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	    //    auth.inMemoryAuthentication().withUser("guest").password("{noop}guest1234").roles("USER");
	        auth.inMemoryAuthentication().withUser("admin").password("{noop}admin1234").roles("ADMIN");
	    }
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
        .anyRequest().authenticated()
        .and()
        .formLogin().disable()
        
        .httpBasic();
	
http.csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());
	}

	

}
