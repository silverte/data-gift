package com.sktelecom.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class DataGiftApplication {

	public static void main(String[] args) {
		log.debug("hi~~");
		SpringApplication.run(DataGiftApplication.class, args);
		
	}

}
