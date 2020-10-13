package first;

public class StringIndexTest {

	public static void main(String[] args) {
		// String index 사용
		String str = "ABCDE";
		String result = "";
		for (int i=str.length()-1; i>=0; i--) {
			result += str.charAt(i); // ""+'A' -> "A"+'B' -> "AB"+'C' -> "ABC"
		}
		System.out.println("result -> " + result);

	}

}
