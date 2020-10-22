package basic;

import java.math.BigInteger;

public class BigIntegerTest {

	public static void main(String[] args) {
		System.out.println("최대 정수 표현 : " + Long.MAX_VALUE);
		System.out.println("최소 정수 표현 : " + Long.MIN_VALUE);
		
		BigInteger bigValue1 = new BigInteger("100000000000000000000");
		BigInteger bigValue2 = new BigInteger("-99999999999999999999");
		
		BigInteger addResult = bigValue1.add(bigValue2);
		BigInteger mulResult = bigValue1.multiply(bigValue2);
		
		System.out.println(addResult);
		System.out.println(mulResult);
		
		

	}

}
