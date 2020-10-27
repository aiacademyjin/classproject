package ver07;

import java.io.Serializable;

public abstract class PhoneInfor implements Infor/* , Serializable */ {  // extends Object
	
	// 친구의 이름, 전화번호, 주소, 이메일
	// 캡슐화 : 정보은닉 ( 변수의 직접 접근을 제한 - 변수를 보호)
	private String name;		// 이름
	private String phoneNum;	// 전화번호
	private String addr;		// 주소
	private String email;
	
	public PhoneInfor(String name, String phoneNum, String addr, String email) {
		//super();  // Object 클래스의 생성자를 호출
		this.name = name;
		this.phoneNum = phoneNum;
		this.addr = addr;
		this.email = email;
	}
	
	// getter/setter 메서드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	// 정보 출력 기능 : 하위 클래스에서 오버라이딩 하는 목적
	@Override
	public void showInfor() {
		System.out.println("이   름 : " + name);
		System.out.println("전   화 : " + phoneNum);
		System.out.println("주   소 : " + addr);
		System.out.println("이메일 : " + email);
	}
	
	// 추상메서드 void showBasicInfor() 멤버로 가진다.
	
	
	

}
