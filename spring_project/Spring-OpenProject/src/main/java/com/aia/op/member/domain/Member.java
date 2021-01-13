package com.aia.op.member.domain;

import java.sql.Timestamp;

public class Member {

	private int idx;
	private String memberid;
	private String membername;
	private String password;
	private String memberphoto;
	private Timestamp regdate;

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getMemberid() {
		return memberid;
	}

	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}

	public String getMembername() {
		return membername;
	}

	public void setMembername(String membername) {
		this.membername = membername;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMemberphoto() {
		return memberphoto;
	}

	public void setMemberphoto(String memberphoto) {
		this.memberphoto = memberphoto;
	}

	public Timestamp getRegdate() {
		return regdate;
	}

	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}
	
	public LoginInfo toLoginInfo() {
		return new LoginInfo(memberid, membername, memberphoto);
	}
	
	

	@Override
	public String toString() {
		return "Member [idx=" + idx + ", memberid=" + memberid + ", membername=" + membername + ", password=" + password
				+ ", memberphoto=" + memberphoto + ", regdate=" + regdate + "]";
	}

}
