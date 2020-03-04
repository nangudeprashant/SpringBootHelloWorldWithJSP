package com.javaLive.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.javaLive.*"})
public class SpringBootHelloWorldWithJspApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloWorldWithJspApplication.class, args);
	}

}
