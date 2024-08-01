package com.microservices.receiver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/receiver")
public class ReceiverController {

	@Value("${server.port}")
	private String portNumber;

	@GetMapping("/port")
	public ResponseEntity<Integer> getPort() {
		int receiverPortNumber = Integer.parseInt(portNumber);
		return ResponseEntity.ok(receiverPortNumber);
	}
}
