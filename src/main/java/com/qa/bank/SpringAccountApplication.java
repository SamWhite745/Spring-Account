package com.qa.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringAccountApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SpringAccountApplication.class, args);
	}

}
