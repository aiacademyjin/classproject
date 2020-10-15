package fruit.ver02;

/*
	파일이름 : Fruitbuyer.java
	설명 : 구매자의 객체를 정의
	작성일시 : 2020.10.08
	수정내용 : fruit.FruitBuyer.java 를 기반으로 생성자를 추가
*/

public class FruitBuyer {
	
	// 변수 와 메서드 정의
	
	// 수정 : 2020.10.08, 변수의 초기화 코드 생략
	// 구매자의 소유 금액, 소유한 사과의 개수
	private int myMoney;		// 구매자의 보유 금액
	private int numOfapple;		// 보유한 사과의 개수
	
	// 기능 : 사과 구매, 현재 상태(금액, 사과의 개수) 값을 출력
	// 사과를 구매
	// 		판매자 정보(객체)와 금액을 받아
	// 		판매자의 판매 메서드 호출 -> 구매하는 사과의 개수를 얻는다.
	// 		나의 사과의 개수를 증가
	// 		나의 보유 금액을 감소
	
	// 2020.10.08 : 생성자 정의 , 변수의 초기화 목적

	
//	public FruitBuyer() {
//		this(5000, 0);
//	}
	
	public FruitBuyer(int myMoney, int numOfapple) {
		this.myMoney = myMoney;			// this -> 자신을 가르키는 참조변수
		this.numOfapple = numOfapple;
	}




	// 참조변수는 객체의 주소를 저장하고 있다 -> 셀러의 참조값을 받도록 참조변수를 매개변수로 정의
	// FruitSeller seller -> FruitSeller 클래스로 만든 객체의 주소를 저장하는 변수
	void buyApple(FruitSeller seller, int money) {
		
		// 구매할 사과의 개수를 구한다.
		int num = seller.saleApple(money);
		// 나의 사과의 개수를 증가
		numOfapple += num;
		// 나의 보유 금액을 감소
		myMoney -= money;
		
	}

	// 현재 상태(금액, 사과의 개수) 값을 출력
	void showBuyResult() {
		System.out.println("보유 금액 : " + myMoney);
		System.out.println("보유한 사과의 개수 : " + numOfapple);
	}
	
	

}
