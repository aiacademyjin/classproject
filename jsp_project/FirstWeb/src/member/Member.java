package member;

// beans 생성
public class Member {

	// 아이디, 비번, 이름, 사진
	private String userId; // 회원의 아이디
	private String pw; // 회원의 비밀번호
	private String userName; // 회원의 이름
	private String photo; // 회원의 프로필 사진

	// 기본 생성자 필수
	public Member() {
	}

	public Member(String userId, String pw, String userName, String photo) {
		this.userId = userId;
		this.pw = pw;
		this.userName = userName;
		this.photo = photo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "Member [userId=" + userId + ", pw=" + pw + ", userName=" + userName + ", photo=" + photo + "]";
	}

}
