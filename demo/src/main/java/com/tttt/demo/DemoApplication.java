package com.tttt.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		System.out.println("Hello");
		System.out.println("Hello2");
		System.out.println("Hello3");
		System.out.println("Master1");
	}

}
