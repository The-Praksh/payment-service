package com.microservice.paymentservice.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class PaymentController {
	
	//get method
	@GetMapping("/payment/initiate")
	public String initiatePayment() {
		return "Payment Successful";
	}

}
