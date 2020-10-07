package card;

public class CardMain {

	static int weight = 5;
	
	public static void main(String[] args) {
		
		System.out.println(Math.PI);
		
		System.out.println(Math.random());
		
		System.out.println(CardMain.weight);
		
		System.out.println("카드의 폭 사이즈:"+Card.width);
		
		Card.play();
		
		Card c1 = new Card("hart", 10);
		Card c2 = new Card();
		
		System.out.println("============================");
		System.out.println("카드 1의 정보");
		System.out.println("모양 : " + c1.kind + ", 숫자는 " + c1.number);
		System.out.println("카드 2의 정보");
		System.out.println("모양 : " + c2.kind + ", 숫자는 " + c2.number);
		System.out.println("============================");
		
		
		c1.play();
		
		System.out.println("카드의 폭 사이즈 : " + c1.width);
		System.out.println("카드의 폭 사이즈 : " + c2.width);
		
		Card.width = 120;
		System.out.println("카드의 폭  사이즈 변경");

		System.out.println("카드의 폭 사이즈 : " + c1.width);
		System.out.println("카드의 폭 사이즈 : " + c2.width);
		

	}

}





