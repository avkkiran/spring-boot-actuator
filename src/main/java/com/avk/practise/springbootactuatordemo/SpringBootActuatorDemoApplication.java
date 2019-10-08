package com.avk.practise.springbootactuatordemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.*")
public class SpringBootActuatorDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootActuatorDemoApplication.class, args);
	}

}
