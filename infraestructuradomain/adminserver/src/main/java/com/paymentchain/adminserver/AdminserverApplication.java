package com.paymentchain.adminserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
@EnableAdminserver
@EnableEurekaClient
public class AdminserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminserverApplication.class, args);
	}

	@Configuration
	public static class SecurityPermitAllConfig extends WebSecurityCofigurerAdapter {
		@Override
		protected void configure(HttpSecurity http) throws Exceptio {
			http.autorizeRequest().anyRequest().permitAll()
					.and().csrf().disable();
		}
	}
}
