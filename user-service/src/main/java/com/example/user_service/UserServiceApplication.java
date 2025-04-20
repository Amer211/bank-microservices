package com.example.user_service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class UserServiceApplication {

	private static final Logger logger = LogManager.getLogger(UserServiceApplication.class);
	public static void main(String[] args) {

		SpringApplication.run(UserServiceApplication.class, args);
		logger.info("*******user-service has started*****");
		System.out.println("""
				***************************************
				User-Service has started
				***************************************""");

	}

}
