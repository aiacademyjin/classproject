<%@page import="guestbook.model.MessageListView"%>
<%@page import="guestbook.service.GetMessageListService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
	// list.jsp?page=2
	String pageNumberStr = request.getParameter("page");
	int pageNumber = 1;
	if(pageNumberStr != null && !pageNumberStr.isEmpty()){
		try{
			pageNumber = Integer.parseInt(pageNumberStr);
		} catch (NumberFormatException e){
		}
	}
	
	GetMessageListService listService = GetMessageListService.getInstance();
	MessageListView listView = listService.getMessageList(pageNumber);
	
	request.setAttribute("listView", listView);

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	div.msgBox {
		padding: 5px;
		width: 400px;
		border: 1px solid #AAA;	
		margin : 5px 0;
	}
	
	div.paging {
		padding : 10px;
		width: 390px;
		
		text-align: center;
		
		margin-top: 10px;
		margin-bottom: 50px;
		
		overflow: hidden; 
	}
	
	div.numberBox { 
		border: 1px solid #AAA;
		width : 30px;
		height: 30px;
		float: left;
		margin: 0 5px;
	}
	
	div.numberBox > a{
		display: block;
		height: 30px;
		line-height: 30px;
		text-decoration: none;
	}
	
	
</style>
</head>
<body>

	<h3>방명록 작성</h3>
	<form action="writeMessage.jsp" method="post">
		<table>
			<tr>
				<td>이름</td>
				<td><input type="text" name="guestName" > </td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="password"> </td>
			</tr>
			<tr>
				<td>메시지</td>
				<td>
					<textarea name="message" rows="5" cols="30"></textarea> 
				</td>
			</tr>
			<tr>
				<td></td>
				<td> <input type="submit" value="글쓰기"> <input type="reset"> </td>
			</tr>
		</table>
	</form>
	
	<hr>
	
	
	<div class="wrap">
		
		<c:if test="${empty listView.messageList}">
		<%-- <c:if test="${listView.messageTotalCount eq 0}"> --%>
		<%-- <c:if test="${listView.empty}"> --%>
		
		<div class="msgBox">작성된 게시물이 없습니다.</div>		
		
		</c:if>
		
		<c:if test="${not empty listView.messageList}">
		
			<c:forEach items="${listView.messageList}" var="message">
			
			<div class="msgBox">
				<table>
					<tr>
						<td>게시물 ID</td>
						<td>${message.id}</td>
					</tr>	
					<tr>
						<td>작성자</td>
						<td>${message.guestName}</td>
					</tr>					
					<tr>
						<td>메시지</td>
						<td>${message.message}</td>
					</tr>
					<tr>
						<td>작성일</td>
						<td>${message.writedate}<br><fmt:formatDate value="${message.toDate}" pattern="yyyy.MM.dd. HH:mm"/>   </td>
					</tr>
					<tr>
						<td></td>
						<td><a href="#">삭제하기</a></td>
					</tr>
				</table>
			</div>
			
			</c:forEach>
			
			<div class="paging">
			<c:forEach begin="1" end="${listView.pageTotalCount}" var="num">
			<div class="numberBox">
			<a href="list.jsp?page=${num}">${num}</a>
			</div> 
			</c:forEach>
			</div>
		
		
		</c:if>
		
		
	</div>
	
	
	
	
	
	
</body>
</html>