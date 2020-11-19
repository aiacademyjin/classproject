package dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class DeptManager {

	// 사용자 입력
	Scanner sc = new Scanner(System.in);

	DeptDao dao = DeptDao.getInstance();

	// 부서입력 메소드 : 사용자에게 입력 받은 데이터를 DAO를 이용해서 DB 입력
	void insertDept() {

		// 부서정보를 받아서 인스턴스를 생성하고 dao.insertDept()

		System.out.println("부서정보를 입력합니다.");
		System.out.println("부서번호를 입력해주세요.");
		String deptno = sc.nextLine();
		System.out.println("부서이름을 입력해주세요.");
		String dname = sc.nextLine();
		System.out.println("지역 이름을 입력해주세요.");
		String loc = sc.nextLine();

		Dept dept = new Dept(Integer.parseInt(deptno), dname, loc);

		Connection conn = null;

		// 2. DB 연결 localhost == 127.0.0.1
		String jdbcUrl = "jdbc:mysql://localhost:3306/project?serverTimezone=UTC";
		String user = "bit";
		String password = "bit";
		
		int resultCnt = 0;

		try {
			conn = DriverManager.getConnection(jdbcUrl, user, password);
			
			resultCnt = dao.insertDept(dept, conn);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(resultCnt>0) {
			System.out.println("입력되었습니다.");
		} else {
			System.out.println("입력이 실패했습니다.");
		}
	}

}
