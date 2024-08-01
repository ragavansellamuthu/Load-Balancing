package com.microservices.sender.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@EnableFeignClients(basePackages = "com.microservices.sender.service")
@Configuration
public class FeignClientConfig {

}
