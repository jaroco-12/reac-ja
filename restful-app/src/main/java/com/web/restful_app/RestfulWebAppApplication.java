package com.web.restful_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class RestfulWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulWebAppApplication.class, args);
	}

}
