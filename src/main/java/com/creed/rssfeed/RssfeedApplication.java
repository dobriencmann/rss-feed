package com.creed.rssfeed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RssfeedApplication {

	public static void main(String[] args) {
		SpringApplication.run(RssfeedApplication.class, args);
		System.out.println("In main of RssfeedApplication");
	}

}
