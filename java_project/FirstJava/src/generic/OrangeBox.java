package generic;

public class OrangeBox {

	Orange orange;
	
	public void store(Orange orange) {
		this.orange = orange;
	}
	public Orange pullOut() {
		return orange;
	}
}
