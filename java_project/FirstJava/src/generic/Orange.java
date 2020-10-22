package generic;

public class Orange {

	private int sugarContent;	// 당분 함량
	
	Orange(int sugar){
		this.sugarContent = sugar;
	}
	
	public void showSugarContent() {
		System.out.println("오렌지의 당도 : " + sugarContent);
	}
	
}
