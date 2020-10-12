package ver01;

public class PhoneInfor {

	/*
	 Version 0.1 전화번호 관리 프로그램. 
			PhoneInfor 라는 이름의 클래스를 정의해 보자. 
			클래스는 다음의 데이터들의 문자열 형태로 저장이 가능 해야 하며, 
			저장된 데이터의 적절한 출력이 가능하도록 메소드 정의
			• 이름            name              String
			• 전화번호       phoneNumber     String
			• 생년월일       birthday            String 
			단, 생년월일 정보는 저장할 수도 있고, 저장 않을 수도 있게끔 생성자 생성.
	 */
	
	// 변수 설정
	String name;		// 친구의 이름
	String phoneNumber;	// 전화번호
	String birthday;	// 생일
	
	// 생성자 : 세개의 데이터를 받아 초기화
	PhoneInfor(String name, String phoneNumber, String birthday){
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}
	
	// 생성자 : 두개 데이터 (이름, 전화번호)
	PhoneInfor(String name, String phoneNumber){
//		this.name = name;
//		this.phoneNumber = phoneNumber;
		//this(name, phoneNumber, "생일정보 없음");
		this(name, phoneNumber, null);
	}
	
	
	// 저장된 데이터의 적절한 출력 메서드
	void showInfor() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNumber);
		
		if(birthday == null) {
			System.out.println("생일 : 입력 데이터 없음");
		} else {
			System.out.println("생일 : " + birthday);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
