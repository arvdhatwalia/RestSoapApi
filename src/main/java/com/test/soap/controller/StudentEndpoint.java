package com.test.soap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.test.soap.GetGcdResponse;
import com.test.soap.GetGcdSumResponse;
import com.test.soap.GetStudentRequest;
import com.test.soap.GetStudentResponse;

@Endpoint
public class StudentEndpoint {
	private static final String NAMESPACE_URI = "http://test.com/soap";
	@Autowired
	private StudentUtility studentUtility;

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getStudentRequest")
	@ResponsePayload
	public GetStudentResponse getCountry(@RequestPayload GetStudentRequest request) {
		GetStudentResponse response = new GetStudentResponse();
		response.setStudent(studentUtility.getStudent(request.getStudentId()));
		System.out.println(request.getTest());
		return response;
	}

	@ResponsePayload
	public GetGcdResponse getGcd() {
		System.out.println("gcd");
		GetGcdResponse getGcd = new GetGcdResponse();
		getGcd.setGcd(232);
		return getGcd;
	}

	@ResponsePayload
	public GetGcdSumResponse getGcdSum() {
		System.out.println("gcdSum");
		GetGcdSumResponse getGcd = new GetGcdSumResponse();
		getGcd.setGcdSum(2232);
		return getGcd;
	}
}