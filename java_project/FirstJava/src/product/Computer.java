package product;

public class Computer extends Product{

	public Computer(int price) {
		super(price);
	}

	@Override
	public String toString() {
		return "Computer ["+price+"]";
	}
	
	

}
