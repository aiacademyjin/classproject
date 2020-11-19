package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCMysqlConnectionTest {

	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
			// 1. 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Load !!!");
			
			// 2. DB 연결     localhost == 127.0.0.1
			String jdbcUrl = "jdbc:mysql://localhost:3306/project?serverTimezone=UTC";
			String user = "bit";
			String password = "bit";
			
			conn = DriverManager.getConnection(jdbcUrl, user, password);
			System.out.println("데이터베이스에 접속했습니다.");
			
			// ..........
			
			
			
			conn.close();		
			
		} catch (ClassNotFoundException e) {
			System.out.println("Driver 로드 실패");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		 
		
		
		
	}

}
