package ver07;

public interface Menu {

	// public static final 생략
	int INSERT=1;
	int SEARCH=2;
	int DELETE=3;
	int DISPLAY_ALL=4;
	// 2020.10.27 : 인스턴스를 저장하는 메뉴 추가
	int SAVE=5;
	int EXIT=6;
	// 입력 시 사용 메뉴
	int UNIV=1;
	int COM=2;
	int CAFE=3;
}
