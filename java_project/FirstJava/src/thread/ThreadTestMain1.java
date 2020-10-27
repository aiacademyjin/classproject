package thread;

import javax.swing.JOptionPane;

public class ThreadTestMain1 {

	public static void main(String[] args) {
		
		String age = JOptionPane.showInputDialog("나이를 입력해 주세요");
		
		int ageNumber = Integer.parseInt(age);
		
		System.out.println("저의 나이는 "+ age + "살 입니다.");
		
		for(int i=10; i>0 ; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
