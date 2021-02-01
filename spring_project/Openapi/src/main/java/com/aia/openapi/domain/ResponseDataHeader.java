package com.aia.openapi.domain;

public class ResponseDataHeader {

	private String resultCode;
	private String resultMsg;

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMsg() {
		return resultMsg;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

	@Override
	public String toString() {
		return "ResponseDataHeader [resultCode=" + resultCode + ", resultMsg=" + resultMsg + "]";
	}
	
	

}
