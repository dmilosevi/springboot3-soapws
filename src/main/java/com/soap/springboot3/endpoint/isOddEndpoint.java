package com.soap.springboot3.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.soap.springboot3.service.IsOddService;

import isodd.test.soap.springboot3withjakarta.CustomerRequest;
import isodd.test.soap.springboot3withjakarta.CustomerResponse;

@Endpoint
public class isOddEndpoint {

	private static final String NAMESPACE="http://SpringBoot3WithJakarta.SOAP.Test.isOdd";

	@Autowired
	private IsOddService service;
	
	@PayloadRoot(namespace = NAMESPACE, localPart = "CustomerRequest")
	@ResponsePayload
	public CustomerResponse getOddStatus(@RequestPayload CustomerRequest request) {
		return service.checkIsOdd(request);
	}
}
