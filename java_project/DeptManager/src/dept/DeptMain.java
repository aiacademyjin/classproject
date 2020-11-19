package dept;

public class DeptMain {

	public static void main(String[] args) {
		
		DeptManager manager = new DeptManager();
		
		// 데이터 베이스 드라이버 로드
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			manager.insertDept();
			
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
