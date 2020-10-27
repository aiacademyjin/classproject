package thread;

public class AdderThreadMain2 {

	public static void main(String[] args) {
		
		Sum sum = new Sum();
		
		AdderThread1 t1 = new AdderThread1(sum, 1, 5000);
		AdderThread1 t2 = new AdderThread1(sum, 5001, 10000);
		
		t1.start();
		t2.start();
		
		try {
			//Thread.sleep(100);
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("1~100 합:" + sum.getNum());
		
		
		
		
	}

}
