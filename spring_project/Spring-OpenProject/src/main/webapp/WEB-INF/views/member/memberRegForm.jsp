<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<%@ include file="/WEB-INF/views/include/basicset.jsp" %>

<style>

	.font_red{
		color : red;
	}
	
	.font_blue {
		color : blue;
	}
	
	#idCheckMsg {
		display: none;
	}
	
	#idCheckMsg.display_block {
		display: block;
	}
	
	#idcheck {
		display: none;
	}


</style>
</head>
<body>


	<%@ include file="/WEB-INF/views/include/header.jsp"%>

	<%@ include file="/WEB-INF/views/include/nav.jsp"%>

	<div class="contents">
		<h2 class="content_title">회원 가입 폼</h2>
		<hr>
		<div class="content">
		
			<form id="regForm" method="post" enctype="multipart/form-data">
				<table>
					<tr>
						<th><label for="userid">아이디(email)</label></th>
						<td>
							<input type="email" id="userid" name="userid"> 
							<input type="checkbox" name="icheck" id="idcheck">
							<div id="idCheckMsg"></div>
							</td>
					</tr>
					<tr>
						<th><label for="pw">비밀번호</label></th>
						<td><input type="password" id="pw" name="pw"></td>
					</tr>
					<tr>
						<th><label for="username">이름</label></th>
						<td><input type="text" id="username" name="username">
						</td>
					</tr>
					<tr>
						<th><label for="userPhoto">사진</label></th>
						<td><input type="file" id="userPhoto" name="userPhoto">
						</td>
					</tr>
					<tr>
						<th></th>
						<td><input type="submit" value="회원가입"></td>
					</tr>
				</table>
			</form>
			
			<div>
			ajax로 회원 가입 <input type="button" value="회원가입" id="btnReg">
			</div>
			
			
		</div>
	</div>

	<%@ include file="/WEB-INF/views/include/footer.jsp"%>




<script>

	$(document).ready(function(){
		
		
		$('#btnReg').click(function(){
			
			var photoFile = $('#userPhoto');
			
			var file1 = photoFile[0].files[0];
			
			//console.log(file1);
			
			var formData = new FormData();
			formData.append("userid", $('#userid').val());
			formData.append("pw", $('#pw').val());
			formData.append("username", $('#username').val());
			formData.append("userPhoto", file1);
			
			console.log(formData);
			
			$.ajax({
				url : '/op/member/reg',
				type : 'post',
				data : formData,
				enctype : 'multipart/form-data',
				processData : false,
				contentType : false,
				cache : false ,
				success : function(data){
					console.log(data);
				}
			});
			
			
			
			
		});
		
		
		
		
 		$('#regForm').submit(function(){
			var chk = $('#idcheck').is(':checked');
			if(!chk){
				alert('아이디 중복여부가 체크되어야 합니다.');
				return false;
			}
		}); 
		
		
		
		
		$('#userid').focusout(function(){
			
			var userid =  $(this).val();
			var msg = $('#idCheckMsg');
			msg.addClass('display_block');
			
			var checkBox = $('#idcheck');
			
			checkBox.prop('checked', false);
			
			if(userid.length==0){
				//alert('id는 필수 항목입니다.');
				msg.html('id는 필수 항목입니다.');
				msg.addClass('font_red');
				
				
			} else {
				
				$.ajax({
					url : 'idcheck',
					data : {id:userid},
					success : function(data){
						if(data=='Y'){
							//alert('사용가능한 아이디 입니다.');
							msg.html('사용가능한 아이디 입니다.');
							msg.removeClass('font_red');
							msg.addClass('font_blue');
							checkBox.prop('checked', true);
							
						} else {
							//alert('사용불가능한 아이디 입니다.');
							msg.html('사용불가능한 아이디 입니다.');
							msg.removeClass('font_blue');
							msg.addClass('font_red');
						}
					},
					error : function(){
						//alert('사용불가능한 아이디 입니다.');
						msg.html('사용불가능한 아이디 입니다.');
						msg.removeClass('font_blue');
						msg.addClass('font_red');
					}
				});
			}
		});
		
		$('#userid').focusin(function(){
			
			$(this).val('');
			
			var msg = $('#idCheckMsg');
			msg.removeClass('font_red');
			msg.removeClass('font_blue');
			msg.removeClass('display_block');
			
			checkBox.prop('checked', false);
			
		});
		
		
	});




</script>







</body>
</html>