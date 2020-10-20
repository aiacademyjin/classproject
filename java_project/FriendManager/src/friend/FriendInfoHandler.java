package friend;

import java.util.Scanner;

public class FriendInfoHandler {

	// 친구정보를 저장하는 배열
	private Friend[] friends;	// 친구의 정보를 저장하는 배열 
	private int numOfFriends;	// 저장된 친구의 정보 개수, 배열의 요소 추가시 index로 사용
	
	// 생성자로 초기화
	public FriendInfoHandler(int num) {
		friends = new Friend[num];
		numOfFriends = 0;
	}
	
	// 배열에 친구 정보를 저장하는 기능 : 다형성을 이용한 매개변수 정의
	void addFriendInfo(Friend f) {
		friends[numOfFriends++] = f;
		//numOfFriends++;
	}
	
	// choice -> 고교 친구 : 1, 대학 친구 : 2 
	void addFriend(int choice) {
		
		// 사용자로 부터 기본 정보를 입력받자 : 이름, 전화번호, 주소
		Scanner sc = new Scanner(System.in);
		
		System.out.println("친구 정보의 입력을 시작합니다.");
		System.out.println("이름을 입력해주세요 >> ");
		String name = sc.nextLine();
		
		System.out.println("전화번호를 입력해주세요 >> ");
		String pNum = sc.nextLine();
		
		System.out.println("주소를 입력해주세요 >> ");
		String addr = sc.nextLine();
		
		// 인스턴스를 생성해서 저장
		// 인스턴스 생성 : 고교 친구와 대학 친구가 다르다
		if(choice==Menu.INSERT_HIGH) {
			// 고교 친구 데이터 받고 -> 인스턴스 생성 -> 배열에 저장
			System.out.println("직업을 입력해주세요 >> ");
			String work = sc.nextLine();
			//Friend f = new HighFriend(name, pNum, addr, work);
			// 배열에 저장
			addFriendInfo(new HighFriend(name, pNum, addr, work)); 
		} else {
			// 대학 친구 데이터 받고 -> 인스턴스 생성 -> 배열에 저장
			System.out.println("전공을 입력해주세요 >> ");
			String major = sc.nextLine();
			// 대학친구의 인스턴스를 배열에 저장
			addFriendInfo(new UnivFriend(name, pNum, addr, major));
		}
		
		System.out.println("입력이 완료되었습니다.\n");	
		
	}
	
	
	
	
	// 전체 정보를 출력하는 메서드 : showData()
	public void showAllData() {
		System.out.println("전체 데이터를 출력합니다. ======================");
		for(int i=0; i<numOfFriends; i++) {
			friends[i].showData(); // friends[0] -> Friend 타입의 참조변수 = 하위클래스의 인스턴스들을 참조
			System.out.println("--------------");
		}
	}
	
	// 전체 기본정보를 출력하는 메서드 : showBasicInfo()
	public void showAllSimpleData() {
		System.out.println("간단한 데이터를 출력합니다. ======================");
		for(int i=0; i<numOfFriends; i++) {
			friends[i].showBasicInfo();
			System.out.println("--------------");
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
