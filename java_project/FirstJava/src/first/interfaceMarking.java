package first;

public class interfaceMarking {

	public static void main(String[] args) {
		
		PointOne pos1 = new PointOne(1, 1);
		PointTwo pos2 = new PointTwo(2, 2);
		PointOne pos3 = new PointOne(3, 3);
		PointTwo pos4 = new PointTwo(4, 4);
		
		String test = "test";
		
		ClassPrinter.print(pos1);
		ClassPrinter.print(pos2);
		ClassPrinter.print(pos3);
		ClassPrinter.print(pos4);
		ClassPrinter.print(test);

	}

}

interface UpperCasePrintable{
	
}


class PointOne implements UpperCasePrintable{
	private int xPos;
	private int yPos;
	
	PointOne(int x, int y){
		xPos=x;
		yPos=y;
	}
	
	@Override
	public String toString() {
		return "[x pos: "+xPos+", y pos: "+yPos+"]";
	}
}

class PointTwo {
	private int xPos, yPos;
	
	PointTwo(int x, int y){
		xPos=x;
		yPos=y;
	}

	@Override
	public String toString() {
		return "[x pos: "+xPos+", y pos: "+yPos+"]";
	}
}

class ClassPrinter {
	public static void print(Object obj) {
		
		String str = obj.toString();
		// UpperCasePrintable 형변환 가능 여부 확인
		if(obj instanceof UpperCasePrintable) {
			str = str.toUpperCase();
		}
		
		System.out.println(str);
		
	}
}










