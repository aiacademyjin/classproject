package generic;

public class FruitBoxMain {

	public static void main(String[] args) {
	
		AppleBox appleBox = new AppleBox();
		appleBox.store(new Apple(10));
		Apple apple = appleBox.pullOut();
		apple.showWeight();
		
		OrangeBox orangeBox = new OrangeBox();
		//orangeBox.store(new String("오렌지"));
		orangeBox.store(new Orange(100));
		Orange orange = orangeBox.pullOut();
		orange.showSugarContent();

	}

}
