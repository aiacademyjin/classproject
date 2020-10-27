package thread;

public class AdderThreadMain {

	public static void main(String[] args) {
		
		Adderthread at1 = new Adderthread(1, 500000);
		Adderthread at2 = new Adderthread(500000, 1000000);
		
		// 쓰래드 생성
		Thread t1 = new Thread(at1);
		Thread t2 = new Thread(at2);
		
		t1.start();
		t2.start();
		
		try {
			t1.join(); // t1 쓰래드가 종료될 때 까지 다른 쓰래드는 멈춤상태
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("1~100 합은 : " + (at1.getNum()+at2.getNum()) );
		

	}

}
