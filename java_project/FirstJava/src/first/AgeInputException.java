package first;

public class AgeInputException extends Exception {

	private int age;
	
	public AgeInputException(int age) {
		super("유효하지 않은 나이가 입력되었습니다.");
		this.age=age;
	}

	@Override
	public String toString() {
		return "AgeInputException [age=" + age + ", getMessage()=" + getMessage() + "]";
	}
	
	
}
