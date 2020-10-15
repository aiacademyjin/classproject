package first;

public class CarMain {

	public static void main(String[] args) {
		// 클래스멤버도 상속의 대상이다. 클래스멤버는 한번만 생성 , 자손클래스의 이름로도 참조,호출이 가능
		System.out.println(Car.name);
		System.out.println(HybridCar.name);

		Car car1 = new Car(100);
		HybridCar car2 = new HybridCar(100, 50);
		HybridWaterCar car3 = new HybridWaterCar(100, 50, 40);

		car3.showCurrentGauge();

	}

}

class Car {
	static String name= "CAR";
	int gasolinegauge;

	Car(int gasolinegauge) {
		this.gasolinegauge = gasolinegauge;
	}

}

class HybridCar extends Car {

	int electronicGauge;

	// HybridCar(){
	// super();
	// }

	HybridCar(int gasolinegauge, int electronicGauge) {
		// 조상 클래스의 멤버를 초기화 하는 생성자 호출
		super(gasolinegauge);
		
		// 새롭게 정의한 클래스의 멤버를 초기화
		this.electronicGauge = electronicGauge;
	}

}

class HybridWaterCar extends HybridCar {
	
	int waterGauge;

	// HybridWaterCar(){
	// super();
	// }

	HybridWaterCar(int gasolinegauge, int electronicGauge, int waterGauge) {
		super(gasolinegauge, electronicGauge);
		this.waterGauge = waterGauge;
	}

	public void showCurrentGauge() {
		System.out.println("잔여 가솔린 : " + gasolinegauge);
		System.out.println("잔여 전기 : " + electronicGauge);
		System.out.println("잔여 water : " + waterGauge);
	}
}
