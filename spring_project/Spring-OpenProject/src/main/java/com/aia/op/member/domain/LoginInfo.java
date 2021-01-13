package com.aia.op.member.domain;

public class LoginInfo {

	private String memberid;
	private String membername;
	private String memberphoto;

	public LoginInfo(String memberid, String membername, String memberphoto) {
		this.memberid = memberid;
		this.membername = membername;
		this.memberphoto = memberphoto;
	}

	public String getMemberid() {
		return memberid;
	}

	public String getMembername() {
		return membername;
	}

	public String getMemberphoto() {
		return memberphoto;
	}

	@Override
	public String toString() {
		return "LoginInfo [memberid=" + memberid + ", membername=" + membername + ", memberphoto=" + memberphoto + "]";
	}

}
