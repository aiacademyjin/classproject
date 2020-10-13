package arr;

public class UserMain {

	public static void main(String[] args) {
		
		// 여러명의 사용자(User)를 생성해서 처리
//		User u1 = new User(1, "king1");
//		User u2 = new User(2, "king2");
//		User u3 = new User(3, "king3");
		
		// 10명의 사용자(User) 를 저장할 수 있는 배열을 만들자
		// 배열은  여러개의 변수를 만드는것
		// User user; // 참조변수 : 객체의 주소 값 저장
		
		User[] users = new User[10]; 
		// User 타입의 참조변수 10개를 만들고 묶음으로 관리
		users[0]= new User(1, "사용자1");  // 참조변수 users[0] 참조값을 저장한다.
		users[1]= new User(2, "사용자2");
		users[2]= new User(3, "사용자3");
		users[3]= new User(4, "사용자4");
		users[4]= new User(5, "사용자5");
		users[5]= new User(6, "사용자6");
		users[6]= new User(7, "사용자7");
		users[7]= new User(8, "사용자8");
		users[8]= new User(9, "사용자9");
		users[9]= new User(10, "사용자10");
		
		for(int i=0; i<users.length; i++) {
			// users[i] -> 참조변수
			users[i].showData();
		}
		
		
		

	}

}





