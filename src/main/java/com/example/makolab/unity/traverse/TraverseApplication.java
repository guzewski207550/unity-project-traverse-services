package com.example.makolab.unity.traverse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.makolab.unity"})
public class TraverseApplication {

	public static void main(String[] args) {
		SpringApplication.run(TraverseApplication.class, args);
	}
}
