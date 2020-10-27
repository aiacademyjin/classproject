package thread;

public class AdderThread1 extends Thread {
	
	Sum sum;
	int start;
	int end;
	
	public AdderThread1(Sum sum, int start, int end) {
		this.sum = sum;
		this.start = start;
		this.end = end;
	}

	@Override
	public void run() {
		for(int i=start; i<=end; i++) {
			sum.addNum(i);
		}
	}
	
	
	
	

}
