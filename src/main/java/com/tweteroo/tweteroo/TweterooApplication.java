package com.tweteroo.tweteroo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TweterooApplication {

	public static void main(String[] args) {
		SpringApplication.run(TweterooApplication.class, args);
		System.out.println("server is up and listening on port 8080");
	}

}
