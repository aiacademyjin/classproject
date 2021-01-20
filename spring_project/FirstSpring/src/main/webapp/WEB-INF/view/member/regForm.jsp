<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 폼</title>
<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
</head>
<body>

	<h1>회원 가입 폼</h1>
<!-- 	<form method="post">
		아이디 <input type="text" name="memberid" id="memberid"><br>
		비밀번호 <input type="password" name="password" id="password"><br>
		이름 <input type="text" name="membername" id="membername"><br>
		<input type="submit">
	</form> -->
	<!-- 
	2021.01.20
	Rest ajax 사용 목적으로 코드 수정 
	-->
		<form id="regForm">
		아이디 <input type="text" name="memberid" id="memberid"><br>
		비밀번호 <input type="password" name="password" id="password"><br>
		이름 <input type="text" name="membername" id="membername"><br>
		<input type="submit">
	</form>
	<script>
	
		$('#regForm').submit(function(){
			
			var data = {
					memberid : $('#memberid').val(),
					password : $('#password').val(),
					membername : $('#membername').val()
			};
			
			$.ajax({
				url : '/firstspring/rest/ver1/members' ,
				type : 'POST',
				data : JSON.stringify(data),
				contentType : 'application/json; charset=utf-8',
				/* dataType : 'json', */
				async : false,
				success : function(msg){ // msg JSON -> javascript object
					console.log(msg);
					//alert(JSON.stringify(msg));
					if(msg == 'Y'){
						alert('회원가입이 저상적으로 처리되었습니다.');
						
					} else {
						alert('오류가 발생했습니다. 다시 시도해주세요.');
					}
					
				},
				error : function(err){
					console.log(err);
					alert('오류가 발생했습니다. 다시 시도해주세요.');
				}
				
			});
			
			
			return false;
		});
	
	
	</script>

</body>
</html>