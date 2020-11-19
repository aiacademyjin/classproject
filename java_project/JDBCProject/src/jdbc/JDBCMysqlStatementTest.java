package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCMysqlStatementTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
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
			
			// 3. Statment 인스턴스 생성s
			Statement stmt = conn.createStatement();
			
			System.out.println("부서이름을 입력해주세요.");
			String userDname = sc.nextLine();
			System.out.println("부서의 위치를 입력해주세요.");
			String userLoc = sc.nextLine();
			
			// 입력 : insert 
			String slqInsert = "insert into dept (deptno, dname, loc) values (80, '"+userDname+"', '"+userLoc+"')";
			
			int resultCnt = stmt.executeUpdate(slqInsert);
			
			if(resultCnt>0) {
				System.out.println("데이터가 정상적으로 입력되었습니다.");
			}
			
			
			// 4. Sql 실행 : 부서리스트 출력
			String sql = "select * from dept order by deptno";
			
			ResultSet rs = stmt.executeQuery(sql);
			
			// 5. ResultSet 을 이용해서 결과 출력
			while(rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString(3);
				
				//System.out.println(deptno+"\t"+dname+"\t"+loc);
				System.out.printf("%5s", deptno+"\t");
				System.out.printf("%12s", dname+"\t");
				System.out.printf("%12s", loc+"\n");
			}
			
			
			
			
			// 6. close
			rs.close();
			stmt.close();
			conn.close();
				
			
		} catch (ClassNotFoundException e) {
			System.out.println("Driver 로드 실패");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		 
		
		
		
	}

}
