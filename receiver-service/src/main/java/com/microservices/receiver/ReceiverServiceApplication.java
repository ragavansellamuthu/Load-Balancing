package com.microservices.receiver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ReceiverServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReceiverServiceApplication.class, args);
	}

}
