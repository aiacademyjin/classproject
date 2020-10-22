package generic;

public class FruitBoxMain2 {

	public static void main(String[] args) {
	
		FruitBox box1 = new FruitBox();
		box1.store(new Apple(100));
		Apple apple = (Apple)box1.pullOut();
		apple.showWeight();
		
		FruitBox box2 = new FruitBox();
		box2.store("Apple");   // Apple 타입만 들어가야한다!!!
		Apple apple2 = (Apple)box2.pullOut();
		apple2.showWeight();
	}

}
