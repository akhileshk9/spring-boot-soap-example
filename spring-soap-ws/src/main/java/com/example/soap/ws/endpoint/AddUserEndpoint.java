package com.example.soap.ws.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.example.soap.ws.services.AddUserService;
import com.sample.soap.service.UserRequest;
import com.sample.soap.service.UserResponse;

@Endpoint
public class AddUserEndpoint {
	@Autowired
	private AddUserService addUserService;
	
	@PayloadRoot(namespace = "/jaxb/gen",localPart = "userRequest")
	@ResponsePayload
	public UserResponse addUser(@RequestPayload UserRequest req) {
		return addUserService.addUser(req);
	}
}
