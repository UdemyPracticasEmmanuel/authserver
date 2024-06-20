package com.springdemo;

import org.springframework.boot.SpringApplication;

public class TestTestingApplication {

	public static void main(String[] args) {
		SpringApplication.from(AuthServerApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
