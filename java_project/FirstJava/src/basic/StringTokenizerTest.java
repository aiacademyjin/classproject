package basic;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		
		String strData = "hot|진|hot@gmail|서울|010-9999-8888";
		StringTokenizer st = new StringTokenizer(strData, "|", false);
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		System.out.println("------------------------------");
		String pNum = "Tel 82-010-9999-7777 son";
		StringTokenizer st1 = new StringTokenizer(pNum);
		
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}

		System.out.println("------------------------------");
		
		StringTokenizer st2 = new StringTokenizer(pNum, " -"); //  구분자  "-" " "
		
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}

		System.out.println("------------------------------");
		
		StringTokenizer st3 = new StringTokenizer(pNum, "- ", true);
		
		while(st3.hasMoreTokens()) {
			System.out.println(st3.nextToken());
		}
		
		

	}

}
