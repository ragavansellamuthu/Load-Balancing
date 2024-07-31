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
	
//	 Local Horizontal Scaling : 
//		 STEP : 1 - Right Click on "student-service"
//		 STEP : 2 - Run As
//		 STEP : 3 - Run Configurations
//		 STEP : 4 - (Left Menu) Spring Boot App > student-service > Right Click > New Configuration 
//		 STEP : 5 - Name      : Type configuration name . Eg : student-service 8084
//       STEP : 6 - Project   : Select project "student-service"
//	     STEP : 7 - Main Type : Search Button > "StudentServiceApplication"
//       STEP : 8 - (Tab) Arguments > Program Argument  
//		 STEP : 9 - Paste the another "application2.properties" location. (--spring.config.location=classpath:/application2.properties)
//		 NOTE : Including double hyphen
	
}
