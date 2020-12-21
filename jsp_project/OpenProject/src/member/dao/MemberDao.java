package member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

import member.Member;

public class MemberDao {
	
	// 싱글톤 패턴 : 코딩 스타일
	// 외부에서 인스턴스를 생성하지 못한다. 
	// 인스턴스를 반환 해주는 메소드가 있어 인스턴스가 필요한 경유 메소드를 이용해서 얻는다.
	
	// 인스턴스 생성 막는다 : 생성자의 접근제어자 -> private
	private MemberDao() {}
	
	// 객체하나를 생성해서 사용한다.
	private static MemberDao dao = new MemberDao();
	
	// Dao 객체의 참조변수를 반환해주는 메소드 : 외부 클래스 누구나 사용 가능해야한다.
	public static MemberDao getInstance() {
		return dao;
	}
	
	// Member 테이블의 Data를 CRUD
	// insert, select, update, delete
	
	// 데이터 입력
	public int insertMember(Connection conn, Member member) {
		
		int resultCnt = 0;
		
		PreparedStatement pstmt = null;
		
		String sqlInsert = "INSERT INTO member (memberid, password, membername) VALUES (?,?,?)";
		
		try {
			pstmt = conn.prepareStatement(sqlInsert);
			pstmt.setString(1, member.getUserId());
			pstmt.setString(2, member.getPassword());
			pstmt.setString(3, member.getUserName());
			
			resultCnt = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return resultCnt;
	}

	
	// 로그인을 위한 select
	public Member selectMemberLogin(Connection conn, String uid, String pw) {
		
		Member member = null;
		
		String sqlSelect = "SELECT * FROM member where memberid=? and password=?";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sqlSelect);
			pstmt.setString(1, uid);
			pstmt.setString(2, pw);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				member = new Member(
						rs.getString("memberid"), 
						rs.getString("password"), 
						rs.getString("membername"),
						rs.getString("memberphoto"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return member;		
	}
	
	
}










