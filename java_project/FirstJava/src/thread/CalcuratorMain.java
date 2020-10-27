package thread;

public class CalcuratorMain {

	public static void main(String[] args) {

		Calcurator cal = new Calcurator();

		AddThread at = new AddThread(cal);
		MinThread mt = new MinThread(cal);

		at.start();
		mt.start();

		try {
			at.join();
			mt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("연산의 횟수 : " + cal.opPlusCnt);
		System.out.println("연산의 횟수 : " + cal.opMinCnt);

	}
}

class AddThread extends Thread {
	Calcurator cal;

	AddThread(Calcurator c) {
		cal = c;
	}

	public void run() {
		for (int i = 0; i < 100000; i++) {
			System.out.println("1+2=" + cal.add(1, 2));
			System.out.println("1+2=" + cal.add(2, 4));
		}
	}
}

class MinThread extends Thread {

	Calcurator cal;

	public MinThread(Calcurator c) {
		cal = c;
	}

	public void run() {
		for (int i = 0; i < 100000; i++) {
			System.out.println("2-1=" + cal.min(2, 1));
			System.out.println("4-2=" + cal.min(4, 2));
		}
	}

}
