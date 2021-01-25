<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="/WEB-INF/views/include/basicset.jsp"%>

<%-- <link href="<c:url value="/css/bootstrap/signin.css"/>" rel="stylesheet"> --%>
<style>
</style>
</head>
<body>
	<%@ include file="/WEB-INF/views/include/header.jsp"%>
	<%@ include file="/WEB-INF/views/include/nav.jsp"%>

	<main class="container">
		<div
			class="d-flex align-items-center p-3 my-3 text-white bg-purple rounded shadow-sm">
			<div class="lh-1">
				<h1 class="h2 mb-0 text-white lh-1">MEMBER</h1>
			</div>
		</div>

		<div class="my-3 p-3 bg-white rounded shadow-sm">
			<h3 class="border-bottom pb-2 mb-0">Please sign in</h3>
			<div class="d-flex text-muted pt-3">
				<form method="post" class="">
					<label for="userid" class="visually-hidden">Email address</label> 
					<input type="email" id="userid" name="userid" value="${cookie.uid.value}"  
					class="form-control" placeholder="Email address" required autofocus> 
					<label for="pw" class="visually-hidden">Password</label> 
					<input type="password" id="pw" name="pw" class="form-control" placeholder="Password" required>
					<div class="checkbox mb-3">
						<label> <input type="checkbox" name="chk" value="on" ${cookie.uid ne null ? 'checked' : ''}>
							Remember ID(email)
						</label>
					</div>
						<input type="submit" value="로그인"  class="w-100 btn btn-lg btn-primary">
				</form>

			</div>
		</div>
	</main>

	<%@ include file="/WEB-INF/views/include/footer.jsp"%>

</body>
</html>