package com.aia.firstspring.member.domain;

public class LoginRequest {

	private String uid;
	private String pw;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "LoginRequest [uid=" + uid + ", pw=" + pw + "]";
	}

}
