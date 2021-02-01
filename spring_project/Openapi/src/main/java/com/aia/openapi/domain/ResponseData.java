package com.aia.openapi.domain;

public class ResponseData {

	private ResponseDataHeader header;
	private ResponseDataBody body;

	public ResponseDataHeader getHeader() {
		return header;
	}

	public void setHeader(ResponseDataHeader header) {
		this.header = header;
	}

	public ResponseDataBody getBody() {
		return body;
	}

	public void setBody(ResponseDataBody body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "ResponseData [header=" + header + ", body=" + body + "]";
	}
	
	

}
