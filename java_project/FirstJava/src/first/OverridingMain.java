package first;

public class OverridingMain {

	public static void main(String[] args) {
		
		//BaseEnSpeaker bs = new BaseEnSpeaker();
		
		//bs.showCurrentState();
		
		// 다형성
		// 조상클래스 타입의 참조변수에 자손클래스타입의 인스턴스를 참조할수 있는것
		// 참조변수는 해당 타입의 멤버만 사용하겠다 라고 선언
		Speaker s = new BaseEnSpeaker();
		// 참조변수 s는 volumeRate 변수와 showCurrentState(), setVolume()만 사용하겠다
		
		// Speaker 클래스가 가지는 멤버
		s.setVolume(10);
		
		// BaseEnSpeaker가 가지는 멤버
		//s.setBaseRate(20);
		
		// BaseEnSpeaker 오버라이딩한 메서드가 호출된다.
		s.showCurrentState();
	
		
		
		
		

	}

}
