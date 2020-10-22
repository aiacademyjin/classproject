package generic;

public class FruitBoxMain3 {

	public static void main(String[] args) {
	
		FruitBox<Apple> box1 = new FruitBox<Apple>(new Apple(100));
		//box1.store(new Apple(10));
		Apple apple = box1.pullOut();
		apple.showWeight();
		
		FruitBox<Orange> box2 = new FruitBox<Orange>(new Orange(150));
		//box2.store(new Orange(150));
		Orange orange = box2.pullOut();
		orange.showSugarContent();
	
	}

}
