<%@page import="member.Member"%>
<%@page import="java.util.List"%>
<%@page import="jdbc.ConnectionProvider"%>
<%@page import="java.sql.Connection"%>
<%@page import="member.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	MemberDao dao = MemberDao.getInstance();
	Connection conn = ConnectionProvider.getConnection();
	
	List<Member> members = null;
	members = dao.selectMember(conn);

	request.setAttribute("memberList", members);
	
	
%>

<jsp:forward page="memberList_view.jsp"/>