<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<nav>
		<ul><!--        /op -->
			<li> <a href="${pageContext.request.contextPath}">HOME</a>  </li>
			<li> <a href="${pageContext.request.contextPath}/member/memberRegForm.jsp">회원가입</a>  </li>
			<li>
				
				<%
					if(session.getAttribute("loginInfo")==null){
				%>		
			 <a href="${pageContext.request.contextPath}/member/loginForm.jsp">LOGIN</a>  
			 <%
					} else {
			 %>
			 <a href="${pageContext.request.contextPath}/member/logout.jsp">LOGOUT</a>
			 <%
					}
			 %>			 
			 </li>
			<li> <a href="${pageContext.request.contextPath}/member/mypage/mypage1.jsp">mypage1</a>  </li>
			<li> <a href="${pageContext.request.contextPath}/member/mypage/mypage2.jsp">mypage2</a>  </li>
			<li> <a href="#">HOME</a>  </li>
		</ul>
	</nav>