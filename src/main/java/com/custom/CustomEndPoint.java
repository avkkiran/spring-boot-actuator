package com.custom;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="customEndPoint")
public class CustomEndPoint {
	public String customStr = null;
	
	public CustomEndPoint() {
		customStr = "Custom Endpoint static string";
	}
	
	@ReadOperation
	public String customEndPoint() {
		return customStr;
	}
}
