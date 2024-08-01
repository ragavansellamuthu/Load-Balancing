package com.microservices.sender.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.microservices.sender.config.FeignClientConfig;

@FeignClient(name="receiver-service",configuration = FeignClientConfig.class)
public interface ReceiverServiceClient {

	@GetMapping("/receiver/port")
	int getPortNumber();
}
