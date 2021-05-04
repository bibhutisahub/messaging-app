package com.bsahu.message;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.retry.annotation.EnableRetry;


/**
 * @author bsahu
 *
 */
@SpringBootApplication
@EnableJms
@EnableRetry
public class MessageAppStarter {
	public static void main(String[] args) {
		System.out.println("App starter");
		SpringApplication.run(MessageAppStarter.class, args);
		
	}
}
