package com.aia.op.member.domain;

import org.springframework.web.multipart.MultipartFile;

public class MemberEditRequest {

	private int idx;
	private String pw;
	private String username;
	private String oldPhoto;
	private MultipartFile userPhoto;

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getOldPhoto() {
		return oldPhoto;
	}

	public void setOldPhoto(String oldPhoto) {
		this.oldPhoto = oldPhoto;
	}

	public MultipartFile getUserPhoto() {
		return userPhoto;
	}

	public void setUserPhoto(MultipartFile userPhoto) {
		this.userPhoto = userPhoto;
	}

	@Override
	public String toString() {
		return "MemberEditRequest [idx=" + idx + ", pw=" + pw + ", username=" + username + ", oldPhoto=" + oldPhoto
				+ ", userPhoto=" + userPhoto.getOriginalFilename() + "]";
	}
	
	

}
