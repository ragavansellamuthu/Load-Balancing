package com.microservices.sender.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.sender.model.PortNumber;
import com.microservices.sender.service.ReceiverServiceClient;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/sender")
@RequiredArgsConstructor
public class SenderController {

	@Value("${server.port}")
	private String senderPortNumber;

	private final ReceiverServiceClient receiverService;

	@GetMapping("/port")
	public ResponseEntity<PortNumber> getPort() {
		PortNumber portNumber = new PortNumber();
		try {
			portNumber.setSenderPortNumber(Integer.parseInt(senderPortNumber));		
			portNumber.setReceiverPortNumber(receiverService.getPortNumber());
		} catch ( Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.ok(portNumber);
	}

}
