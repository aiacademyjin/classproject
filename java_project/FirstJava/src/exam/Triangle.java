package exam;

public class Triangle {
	
	// 변수 : 밑변, 높이
	float width;	// 삼각형의 밑변
	float height;	// 삼각형의 높이
	
	
	// 메서드 : 변수의 값을 변경하는 메서드, 삼각형의 넓이를 구하고 결과를 반환하는 메서드
	// 변수의 값을 변경하는 메서드
	void setData(float w, float h) {
		width = w;
		height = h;
	}
	
	// 삼각형의 넓이를 구하고 결과를 반환하는 메서드 : 밑변 * 높이 / 2f => 결과는 실수 타입으로 
	float area() {
		float result = 0.0f;
		result = width * height / 2;
		return result;
		//return width * height / 2;
	}
	
	public static void main(String[] args) {
		
		Triangle t = new Triangle();
		
		// 밑변과 높이 값을 설정
		t.setData(10, 3);
		
		// 넓이를 구하고 변수에 담는다.
		float result = t.area();
		
		System.out.println(result);

		// 밑변과 높이 값을 설정
		t.setData(3, 3);
		
		// 넓이를 구하고 변수에 담는다.
		result = t.area();
		
		System.out.println(result);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
