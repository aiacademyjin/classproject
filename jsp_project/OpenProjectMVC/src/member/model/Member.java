package member.model;

import java.sql.Timestamp;
import java.util.Date;

// 회원 정보를 저장하는 beans 클래스 정의
public class Member {
	
	// 변수(속성)은 private 
	private String userId;
	private String password;
	private String userName;
	private String userPhoto;
	private Timestamp regDate;
	
	// 기본 생성자 필수
	public Member() {}
	
	public Member(String userId, String password, String userName, String userPhoto, Timestamp regDate) {
		this.userId = userId;
		this.password = password;
		this.userName = userName;
		this.userPhoto = userPhoto;
		this.regDate = regDate;
	}


	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhoto() {
		return userPhoto;
	}

	public void setUserPhoto(String userPhoto) {
		this.userPhoto = userPhoto;
	}
	
	// Member -> LoginInfo
	public LoginInfo toLoginInfo() {		
		return new LoginInfo(this.userId, this.userName, this.userPhoto);
	}

	public Timestamp getRegDate() {
		return regDate;
	}

	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}
	
	// ${member.date} : TimeStamp -> java.util.Date
	public Date getDate() {  
		return new Date(regDate.getTime());
	}
	

	@Override
	public String toString() {
		return "Member [userId=" + userId + ", password=" + password + ", userName=" + userName + ", userPhoto="
				+ userPhoto + "]";
	}
	
	
	
	

}
