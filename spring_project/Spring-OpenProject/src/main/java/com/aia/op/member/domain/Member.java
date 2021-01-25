package com.aia.op.member.domain;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Random;

public class Member {

	private int idx;
	private String memberid;
	private String membername;
	private String password;
	private String memberphoto;
	private Timestamp regdate;
	
	// 2021.01.25 추가
	private char verify;
	private String code;
	
	public Member() {
		getRandomString();
	}
	

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
	
	public char getVerify() {
		return verify;
	}

	public void setVerify(char verify) {
		this.verify = verify;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	// 2021.01.25
	// 난수 발생 : 문자 + 숫자
	private void getRandomString() {
		
		Random r = new Random(System.nanoTime());
		// 난수 문자열 10자리
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<10; i++) {
			if(r.nextBoolean()) {
				// 숫자 발생 -> sb에 추가
				sb.append(r.nextInt(10));
			} else {
				// 문자 발생 -> sb에 추가
				sb.append(  (char)(r.nextInt(26)+97) );
			}
		}
		System.out.println("난수 생성 : " + sb);
		this.code = new String(sb);
	}
	

	public Date getToDate() {
		return new Date(this.regdate.getTime());
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
