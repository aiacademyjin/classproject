package basic;

public class Wrapper1 {

	public static void main(String[] args) {
		
		Integer i1 = new Integer(100);		// 인스턴스 생성
		Integer i2 = new Integer("100");	// 인스턴스 생성
		
		System.out.println("참조변수의 비교 => i1==i2 : " + (i1==i2));
		System.out.println("저장하는 value 값의 비교 => i1.equals(i2) : " + i1.equals(i2));
		System.out.println("i1.toString() : " + i1.toString());
		System.out.println("i1.toString() : " + i2.toString());
		
		System.out.println("Integer.MAX_VALUE : " + Integer.MAX_VALUE);
		System.out.println("Integer.MIN_VALUE : " + Integer.MIN_VALUE);
		System.out.println("Integer.SIZE : " + Integer.SIZE);
		System.out.println("Integer.TYPE : " + Integer.TYPE);
		
		int num = i2.intValue();
		System.out.println("int num = i2.intValue(); => " + num);
		
		int num2 = Integer.parseInt("10");	// String -> int
		num2 += 1;
		System.out.println("num2 => " + num2);
		
		// String -> Integer, int -> Integer
		Integer i3 = Integer.valueOf("10");
		int num3 = i3.intValue();
		System.out.println("num3 => " + num3);

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
