package com.onlineshoppy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
class TestOnlineshoppyApplication {

	public static void main(String[] args) {
		SpringApplication.from(OnlineshoppyApplication::main).with(TestOnlineshoppyApplication.class).run(args);
	}

}
