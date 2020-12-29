<%@page import="member.service.MemberListService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	
	MemberListService service = MemberListService.getInstance();
	service.getMemberListView(request);	

%>

<jsp:forward page="memberList_view.jsp"/>