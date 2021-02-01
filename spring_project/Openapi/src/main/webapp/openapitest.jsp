<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<script>

	url = "http://apis.data.go.kr/1360000/VilageFcstInfoService/getVilageFcst";
	url += "?serviceKey=7SfUZOq52SpD4qLwR2jTusLrmCPg3R4Io3gDfvTUjTkMyDrR6sD9O3sCmy%2BesjmLaG8fYt3vstEIpHB8c4iX0Q%3D%3D";
	url += "&pageNo=1" + "&numOfRows=10" + "&dataType=json"	+ "&base_date=20210131" + "&base_time=0500" + "&nx=1";
	url += "&ny=1";

	$(document).ready(function() {

		$.ajax({
			url : 'http://localhost:8080/openapi' ,
			type : 'get',
			success : function(data) {

				$('body').append(JSON.stringify(data));

			}
		});

	});
</script>
</head>
<body>

</body>
</html>