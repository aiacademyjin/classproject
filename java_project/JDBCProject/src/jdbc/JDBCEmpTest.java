package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCEmpTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Connection conn = null;
		
		try {
			// 1. 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Oracle Driver Load !!!");
			
			// 2. DB 연결     localhost == 127.0.0.1
			String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String password = "tiger";
			
			conn = DriverManager.getConnection(jdbcUrl, user, password);
			System.out.println("데이터베이스에 접속했습니다.");
			
			
			PreparedStatement pstmt = null;
			
			String sqlEmpInsert = "insert into emp values "
					+ " (SEQ_EMP_EMPNO.nextval,?,?,?,to_date(?,'YYYY.MM.DD'),?,?,?)";
			//String sqlEmpInsert = "insert into emp values "
			//      + " (SEQ_EMP_EMPNO.nextval,?,?,?,?,?,?,?)";
			
			pstmt = conn.prepareStatement(sqlEmpInsert);
			pstmt.setString(1, "손흥민"); // ename
			pstmt.setString(2, "MANAGER"); // job
			pstmt.setInt(3, 7839); // mgr
			pstmt.setString(4, "2020.11.18"); // hiredate
			//pstmt.setString(4, "20/11/18"); // hiredate
			pstmt.setInt(5, 3000); // sal
			pstmt.setInt(6, 4000); // comm
			pstmt.setInt(7, 40); // deptno
			
			int resultCnt = pstmt.executeUpdate();
			
			if(resultCnt>0) {
				System.out.println("insert SUCCESS !!!");
			} else {
				System.out.println("insert FAIL !!!");
			}
			
			
			
			pstmt.close();
			conn.close();
				
			
		} catch (ClassNotFoundException e) {
			System.out.println("Driver 로드 실패");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		 
		
		
		
	}

}
