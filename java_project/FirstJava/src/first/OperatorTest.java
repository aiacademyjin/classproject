package first;

import java.lang.Math;
import java.util.Scanner;

public class OperatorTest {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 8;

		System.out.println("10/8 = " + num1 / num2);

		System.out.println("10/8 = " + num1 % num2);

		System.out.println("10/-8 = " + num1 % -8);

		System.out.println("10f/8f = " + 10f / 8f);

		System.out.println("10f/8 = " + 10f / 8);

		System.out.println("10/8 = " + num1 / (float) num2);

		char c1 = 'A';
		char c2 = 'B';

		System.out.println("'A' < 'B' => " + (c1 < c2)); // 65 < 66
		System.out.println("'0' == 0 => " + ('0' == 0)); // 48 == 0

		System.out.println("10.0d == 10.0f => " + (10.0d == 10.0f)); // 10.0d == 10.0d

		System.out.println("0.1d == 0.1f => " + (0.1d == 0.1f)); // 0.1d == 0.1d

		double d = (double) 0.1f;

		System.out.println("d => " + d);

		System.out.println("(float)d == 0.1f => " + ((float) d == 0.1f));

		num1 = 10;
		num2 = 20;

		boolean result1 = num1 == 10 && num2 == 20;
		boolean result2 = num1 <= 12 || num2 >= 30;

		System.out.println("num1 == 10 && num2 == 20 => " + result1);
		System.out.println("num1 <= 12 || num2 >= 30 => " + result2);

		if (!(num1 == num2)) {
			System.out.println("num1과 num2는 같지않다");
		} else {
			System.out.println("num1rhk num2는 같다");
		}

		float pi = 3.141592f;

		float sPi = (int) (pi * 100) / 100f;

		System.out.println(sPi);

		int price = 11234;

		int price2 = price / 1000 * 1000;

		System.out.println(price2);

		float sPi2 = Math.round(pi * 100) / 100f;

		System.out.println(sPi2);

		int i = 5;
		int j = 5;

		System.out.println(i++); // 출력 : 5, i=6
		System.out.println(++j); // 출력 : 6, j=6
		
		System.out.println("i = "+i+", j = "+j);
		
		
		//문자열 처리 : String 클래스 이용 -> 객체 생성  -> 클래스가 가지는 변수와 메서드를 메모리에 로드 한다
		
		// 참조 변수 : 객체의 메모리 주소값을 저장
		String str = null;	// null -> 참조변수가 객체의 주소값을 저장하고 있지 않는다
		
		str = "abc";	// "" 공백 문자열을 이용한 객체를 생성하고 주소값을 반환
		
		System.out.println(str.toString());
		System.out.println(str.equals("abc"));
		
		if(str != null && !str.equals("")) {
			System.out.println( str.charAt(1)  ); // 0~3-1 -> 0, 1, 2			
		}
		
		
		num1=50;
		num2=20;
		
		int big=0; // 큰수
		int diff=0; // 두 수의 차이
		
		// 삼항 연산자 이용
		//big = num1>num2 ? num1 : num2 ;    // big = num1 ;
		//diff = num1>num2 ? num1-num2 : num2-num1  ;
		
		if(num1>num2) {
			big = num1;
			diff = num1 - num2;
		} else {
			big = num2;
			diff = num2 - num1;
		}
		
		
		System.out.println("큰수 : "+big+", 큰수와 작의 수의 차이는 "+diff+" 입니다.");
		
		System.out.println("-------------------------------------");
		
		int n=0;
		
		System.out.println("메뉴를 선택하세요\n1.입력  2.보기  3.수정  4.삭제");
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		switch(n) {
		
			case 1:
				System.out.println("입력 합니다.");
				System.out.println("Simple JAVA");
				break;
			case 2:
				System.out.println("데이터를 열람합니다.");
				System.out.println("Funny JAVA");
				break;
			case 3:
				System.out.println("정보를 수정합니다.");
				System.out.println("Fantastic JAVA");
				break;
			case 4:
				System.out.println("데이터를 삭제합니다.");
				break;
			/*
			 * default: System.out.println("Best JAVA");
			 */
				
		}
		

	}

}














