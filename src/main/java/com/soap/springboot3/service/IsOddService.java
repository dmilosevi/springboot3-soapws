package com.soap.springboot3.service;

import org.springframework.stereotype.Service;

import isodd.test.soap.springboot3withjakarta.CustomerRequest;
import isodd.test.soap.springboot3withjakarta.CustomerResponse;

@Service
public class IsOddService {
	
	public CustomerResponse checkIsOdd(CustomerRequest request) {
		CustomerResponse customerResponse = new CustomerResponse();
		
		if(request.getFirstNumber() > 0 && request.getSecondNumber() > 0) {
			customerResponse.setSum(request.getFirstNumber() + request.getSecondNumber());
		}
		
		if((request.getFirstNumber() + request.getSecondNumber()) % 2 == 0) {
			customerResponse.setIsOdd(false);
		} else {
			customerResponse.setIsOdd(true);
		}
		
		return customerResponse;
	}
}
