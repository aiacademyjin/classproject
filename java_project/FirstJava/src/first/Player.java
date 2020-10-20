package first;

public abstract class Player {
	// 추상클래스 : 클래스의 멤버 메서드 중에 하나라도 추상 메서드를 가지면 추상클래스가 된다 
	
	// 추상메서드 
	// 구현하는 {} 구현부가 없는 메서드
	// 메서드 정의부에 abstarct 키워드를 써준다. 
	// 문장 마지막에는 ; 으로 종료
	abstract void play(int num);
	abstract void stop();
}

abstract class VideoPlayer extends Player{
	// 추상 클래스를 상속해서 추상메서드 play, stop 을 가진다.
	// VideoPlayer 클래스도 추상클래스다.
}

class AudioPlayer extends Player{
	
	// 추상클래스(상위 클래스) 의 void play(int num) 메서드를 오버라이딩 : 구현한다.
	void play(int num) {
		
	}
	
	void stop() {
		
	}
}













