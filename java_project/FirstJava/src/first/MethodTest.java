package first;

public class MethodTest {

	public static void main(String[] args) {
		
		MyMeth my = new MyMeth();
		
		System.out.println(my.add(1,5)); 
		
		my.sayHello();
		
		my.plus(10, 20);
		
		System.out.println(my.check());
		
		hiEveryone();
		
		my.div(10, 2);
		my.div(10, 0);
		
		System.out.println(true);

	}
	
	static void hiEveryone() {
		System.out.println("안녕하세요");
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
