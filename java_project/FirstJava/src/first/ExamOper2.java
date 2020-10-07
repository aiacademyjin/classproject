package first;

public class ExamOper2 {

	public static void main(String[] args) {

		// 문제 2

		int numOfApples = 123; // 사과의 개수

		int sizeOfBucket = 10;

		// 바구니의 크기(바구니에 담을 수 있는 사과의 개수)

		// 1. 전체 사과의 개수를 10으로 나눈다
		// int numOfBucket = numOfApples/10; // 12

		// 2. 전체 사과를 10으로 나눈 나머지를 구하고,
		// 나머지가 10보다 크면 바구니 개수를 1 증가
//		if(numOfApples%10>0) {
//			numOfBucket++;
//		}

		int numOfBucket = numOfApples / 10 + (numOfApples % 10 > 0 ? 1 : 0);

		// 모든 사과를담는데 필요한 바구니의 수

		System.out.println("필요한바구니의 수 :" + numOfBucket);

		// 문제 3
		System.out.println("문제 3 =====================");
		int num = 10;

		System.out.println(num > 0 ? "양수" : (num < 0 ? "음수" : "0"));

		// 문제 4
		System.out.println("문제 4 =====================");
		num = 111;

		System.out.println(num / 100 * 100);

		// 문제 5
		System.out.println("문제 5 =====================");
		num = 777;

		System.out.println(num / 10 * 10 + 1);

		// 문제 6
		System.out.println("문제 6 =====================");
		num = 81;

		System.out.println( 10 - num % 10 );
		
		// 문제 7
		System.out.println("문제 7 =====================");
		int fahrenheit =100;

		float celcius = (int)(5/9f*(fahrenheit-32)*100+0.5)/100f;

		System.out.println("Fahrenheit:"+fahrenheit);

		System.out.println("Celcius:"+celcius);
		
		
		// 문제 8
		System.out.println("문제 8 =====================");
		
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a + b);  
		char ch = 'A';
		ch = (char) (ch + 2); 
		float f = 3 / 2f;    
		long l = 3000 * 3000 * 3000L;    
		float f2 = 0.1f;
		double d = 0.1;
		boolean result = (float)d==f2;    

		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
		
		//문제 9
		System.out.println("문제 9 ===========================");
		ch = 'S';

		boolean b2 = 
				(ch >= 'a' && ch <= 'z') || 
				(ch>='A'&&ch<='Z')||
				(ch>='0'&&ch<='9');

		System.out.println(b2);
		
		//문제 10
		System.out.println("문제 10 ===========================");
				
		ch = 'S';

		char lowerCase = ( ch>='A' && ch<='Z' ) ? (char)(ch+32) : ch;

		System.out.println("ch:"+ch);

		System.out.println("chto lowerCase:"+lowerCase);
		
		
		
		

	}

}
