package com.example.account_service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccountServiceApplication {
	private static final Logger logger = LogManager.getLogger(AccountServiceApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(AccountServiceApplication.class, args);
		logger.info("****Account-service has started*******");
		System.out.println("""
				***************************************
				Account-Service has started
				***************************************""");
	}

}
