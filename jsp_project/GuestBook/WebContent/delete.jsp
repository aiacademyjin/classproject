<%@page import="guestbook.exception.InvalidMessagePasswordException"%>
<%@page import="guestbook.exception.MessageNotFoundexception"%>
<%@page import="java.sql.SQLException"%>
<%@page import="guestbook.service.DeleteMessageService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 메시지 아이디, 비밀번호를 받고 -> 서비스 클래스 인스턴스 생성 -> 삭제 메소드 실행 -> 결과 출력
	
	String messageId = request.getParameter("mid");
	String pw = request.getParameter("pw");
	
	DeleteMessageService service = DeleteMessageService.getInstance();
	
	String msg = "정상적으로 삭제되었습니다.";
	
	try{
		int result = service.deleteMessage(Integer.parseInt(messageId), pw);
	} catch (SQLException e){
		msg = "삭제하는 도중 문제가 발생했습니다. 다시 시도해주세요.";
	} catch (MessageNotFoundexception e){
		msg = "게시물이 존재하지 않습니다.";
	} catch (InvalidMessagePasswordException e){
		msg = e.getMessage() ;
	}
	
	request.setAttribute("resultMsg", msg);	

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>${resultMsg}</h3>
	<a href="list.jsp">게시물 리스트 보기</a>


</body>
</html>