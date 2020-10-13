package first;

public class ArrayCopyTest {

	public static void main(String[] args) {

		// 사용할 원본 배열 생성
		char[] abc = { 'A', 'B', 'C', 'D' };
		char[] number = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		
		System.out.println(abc);
		System.out.println(new String(number));
		
		// abc 배열과 number 배열을 연결해서 사용할 배열 생성
		char[] result = new char[abc.length+number.length];
		
		// Array Copy
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.out.println(result);
		System.arraycopy(number, 0, result, abc.length, number.length);
		System.out.println(result);
		
		// abc를 number에 0 부터 복사
		System.arraycopy(abc, 0, number, 0, abc.length);
		System.out.println("number : " + new String(number));
		
		
		// number index=6 부터 abc index=0 3개를 복사
		System.arraycopy(abc, 0, number, 6, 3);
		System.out.println("number : " + new String(number));
	}

}








