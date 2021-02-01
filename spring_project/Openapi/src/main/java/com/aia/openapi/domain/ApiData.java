package com.aia.openapi.domain;

public class ApiData {
	
	private ResponseData response;

	public ResponseData getResponse() {
		return response;
	}

	public void setResponse(ResponseData response) {
		this.response = response;
	}

	@Override
	public String toString() {
		return "ApiData [response=" + response + "]";
	}
	
	
	

}
