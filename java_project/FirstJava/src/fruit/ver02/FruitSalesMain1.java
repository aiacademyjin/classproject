package fruit.ver02;

public class FruitSalesMain1 {

	public static void main(String[] args) {
		
		// FruitSeller 타입의 참조변수 선언
		FruitSeller seller = null;
		// FruitSeller 의 객체 생성	
		// 객체의 생성은 클래스에 정의된 멤버(변수, 메서드)들을 메모리에 등록하는것
		seller = new FruitSeller(0, 30, 1500);	// 객체 생성 후 객체의 주소값을 반환
		
		FruitSeller seller2 = new FruitSeller(0, 10, 2000);


		// 셀러 3
		FruitSeller seller3 = new FruitSeller(seller);
		
		
		// FruitBuyer 타입의 참조변수 선언과 초기화
		FruitBuyer buyer = new FruitBuyer(10000, 0);
		
		
//		seller.myMoney += 1500;
//		buyer.myMoney -= 1500;
//		
//		seller.numOfApple -= 2;
//		buyer.numOfapple =+ 1;
		
		
		// 사과를 구매 : 3000 지불
		buyer.buyApple(seller, 3000);
		
		// 사과 구매 : 4000 지불
		buyer.buyApple(seller2, 4000);
		
		buyer.buyApple(seller3, 1500);
		
		
		System.out.println("판매자1의 현재 지표");
		seller.showSaleResult();

		System.out.println("판매자2의 현재 지표");
		seller2.showSaleResult();

		System.out.println("판매자3의 현재 지표");
		seller3.showSaleResult();
		
		
		
		System.out.println("==================================");
		
		System.out.println("구매자의 현재 지표");
		buyer.showBuyResult();
		
		
		
		
//		String s = "FruitSeller";
//		seller = s;
		
	}

}
