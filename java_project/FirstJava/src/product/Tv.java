package product;

public class Tv extends Product {

	public Tv(int price) {
		super(price);
		
		// System.out.println(참조값)
		// 참조값.toString()
	}

	@Override
	public String toString() {
		return "Tv ["+price+"]";
	}

//	@Override
//	public String toString() {
//		return "TV";
//	}
	
	
	
	
	
	

}
