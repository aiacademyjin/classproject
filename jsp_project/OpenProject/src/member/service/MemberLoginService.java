package member.service;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jdbc.ConnectionProvider;
import member.dao.MemberDao;
import member.model.LoginInfo;
import member.model.Member;
import util.CookieBox;

public class MemberLoginService {

	// 싱글톤
	private MemberLoginService() {
	}

	private static MemberLoginService service = new MemberLoginService();

	public static MemberLoginService getInstance() {
		return service;
	}

	// request, response 전달 받고
	// 사용자 입력 데이터 id/pw 로그인 처리, 아이디 저장
	// session = request.getSession()
	public void memberLogin(HttpServletRequest request, HttpServletResponse response) {

		// 데이터 받기 : 아이디, 비밀번호
		String userId = request.getParameter("userid");
		String pw = request.getParameter("pw");

		String chk = request.getParameter("chk");

		if (chk != null && chk.equals("on") && userId != null && !userId.isEmpty()) {
			// 쿠키 생성 저장
			// uid=userId
			response.addCookie(CookieBox.createCookie("uid", userId, "/", 60 * 60 * 24 * 365));
		} else {
			response.addCookie(CookieBox.createCookie("uid", userId, "/", 0));
		}

		// session을 이용해서 로그인 처리
		// id, pw를 조건으로 Member 테이블에서 select 한 결과가 있으면 인증 성공, 없으면 인증 실패
		// 로그인 여부 체크
		boolean loginChk = false;
		
		MemberDao dao = null;
		Connection conn = null;
		
		try {
			
			conn = ConnectionProvider.getConnection();
			dao = MemberDao.getInstance();
			
			Member member = dao.selectMemberLogin(conn, userId, pw);
	
			if (member != null) {
	
				// 인증이 되어 로그인 처리 : session 객체에 로그인 정보를 속성에 저장
				// System.out.println(member);
				LoginInfo loginInfo = member.toLoginInfo();
				
				HttpSession session = request.getSession();  
				// getSession() -> session 이 있으면 있는 session을 반환, 없으면 새로운 session 객체를 생성해서 반환
				// getSession(flase) -> session 이 있으면 있는 session을 반환, 없으면 null을 반환
				// getSession(true) -> 새로운 session을 생성해서 반환
	
				session.setAttribute("loginInfo", loginInfo);
	
				// System.out.println(loginInfo);
				loginChk = true;
	
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		request.setAttribute("loginChk", loginChk);

	}

}





