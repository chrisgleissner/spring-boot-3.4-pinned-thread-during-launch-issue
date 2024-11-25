package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws InterruptedException {
		var context = SpringApplication.run(DemoApplication.class, args);
		Thread.sleep(3000);
		context.close();
	}
}
