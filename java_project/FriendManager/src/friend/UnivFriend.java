package friend;

public class UnivFriend extends Friend {
	
	private String major;	// 친구의 전공
	
	// 생성자를 이용해서 초기화
	public UnivFriend(String name, String pNum, String addr, String major) {
		super(name, pNum, addr);
		this.major = major;
	}
	
	// 오버라이딩
	@Override
	public void showData() {
		super.showData();
		System.out.println("전공 : " + major);
	}
	
	// 오버라이딩
	public void showBasicInfo() {
		System.out.println("이름 : " + getName());
		System.out.println("전화 : " + getPhoneNumber());
		System.out.println("전공 : " + major);
	}
	
	
	
	
	
	
	
	

}
