package com.aia.firstspring.domain;

import com.aia.firstspring.member.domain.Member;

public class MemberRegRequest {

	private String memberid;
	private String password;
	private String membername;

	public String getMemberid() {
		return memberid;
	}

	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMembername() {
		return membername;
	}

	public void setMembername(String membername) {
		this.membername = membername;
	}
	
	public Member getToMember() {
		Member member = new Member();
		member.setMemberid(memberid);
		member.setPassword(password);
		member.setMembername(membername);
		return member;
	}

	@Override
	public String toString() {
		return "MemberRegRequest [memberid=" + memberid + ", password=" + password + ", membername=" + membername + "]";
	}

}
