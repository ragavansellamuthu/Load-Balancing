package com.microservices.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

	@Value("${server.port}")
	private String portNumber;

	@GetMapping("/port")
	public String getPort() {
		return "Port Number : " + portNumber;
	}
}
