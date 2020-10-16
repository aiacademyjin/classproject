package first;

public class Speaker {

	private int volumeRate;		// 볼륨 크기
	
	// 현재 볼륨의 크기를 출력
	void showCurrentState() {
		System.out.println("볼륨의 크기 : " + volumeRate);
	}
	
	public void setVolume(int vol) {
		volumeRate = vol; 
	}
}
