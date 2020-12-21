<%@page import="member.LoginInfo"%>
<%@page import="jdbc.ConnectionProvider"%>
<%@page import="java.sql.Connection"%>
<%@page import="member.dao.MemberDao"%>
<%@page import="util.CookieBox"%>
<%@page import="member.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
		// 데이터 받기 : 아이디, 비밀번호
		String userId = request.getParameter("userid");
		String pw = request.getParameter("pw");
		
		String chk = request.getParameter("chk");
		
		if(chk!=null && chk.equals("on") && userId!=null && !userId.isEmpty()){
			// 쿠키 생성 저장
			// uid=userId
			response.addCookie(CookieBox.createCookie("uid", userId, "/", 60*60*24*365));
		} else {
			response.addCookie(CookieBox.createCookie("uid", userId, "/", 0));
		}
		
		
		// session을 이용해서 로그인 처리
		// id, pw를 조건으로  Member 테이블에서 select 한 결과가 있으면 인증 성공, 없으면 인증 실패
		// 로그인 여부 체크
		boolean loginChk = false;
		
		MemberDao dao = MemberDao.getInstance();
		Connection conn = ConnectionProvider.getConnection();
		
		Member member = dao.selectMemberLogin(conn, userId, pw);
		
		if(member != null){
			
			// 인증이 되어 로그인 처리 : session 객체에 로그인 정보를 속성에 저장
			//System.out.println(member);
			LoginInfo loginInfo = member.toLoginInfo();
			
			session.setAttribute("loginInfo", loginInfo);
			
			//System.out.println(loginInfo);
			loginChk = true;
			
		} 		
		
		// login_view.jsp로 포워딩
		if(loginChk){
%>
<jsp:forward page="loginView.jsp"/>
<%
		} else {
%>
<script>
	alert("아이디 또는 비밀번호가 틀립니다. 다시 로그인해주세요. ");
	history.go(-1);
</script>
<%
		}
%>












