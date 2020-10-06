package first;

public class ExamOper1 {

	public static void main(String[] args) {
		
		// 문제 1번
		
		System.out.println("문제 1 -----------------");
		
		int num1=10;
		int num2=20;
		int num3=30;
		
		System.out.println(num1+", "+num2+", "+num3);
		
		num1=num2=num3;
		System.out.println(num1+", "+num2+", "+num3);
		
		num1=num2=num3=50;
		System.out.println(num1+", "+num2+", "+num3);

		
		// 문제 2
		
		System.out.println("문제 2 -----------------");
		
		int result = (((25*5)+(36-4))-72)/5;
		
		System.out.println("{{(25x5)+(36-4)}-72}/5 = "+ result);
		
		
		
		// 문제 3
		
		System.out.println("문제 3 --------------------");
		
		int oper1 = 3+6;
		//int oper2 = 3+6+9;  // oper2 = oper1 + 9
		//int oper3 = 3+6+9+12;  // oper3 = oper2 + 12
		
		int oper2 = oper1 + 9;
		int oper3 = oper2 + 12;
		
		
		// 문제 4
		// a>b>c 가 참이면 true 아니면 false를 출력하는 프로그램 
		
		System.out.println("문제 4 ----------------------");
		
		int a= (((25+5)+(36/4))-72)*5;
		int b= (((25*5)+(36-4))-71)/4;
		int c= (128/4)*2;
		
		// a>b>c
		boolean check = a>b && b>c;
		
		System.out.println(check);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
