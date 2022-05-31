package com.creed.rssfeed;

import com.creed.reader.RSSReader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RSSApplication {

	public static void main(String[] args) {
		SpringApplication.run(RSSApplication.class, args);
		System.out.println("In main of RSSApplication");

		RSSReader reader = new RSSReader("testString");
		System.out.println(reader.getFeed());

	}

}
