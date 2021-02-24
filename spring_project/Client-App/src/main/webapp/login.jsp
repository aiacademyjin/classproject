<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<script src="./js/jquery.cookie-1.4.1.min.js"></script>
<script>
	$(document).ready(function() {
		allCookies = document.cookie;
		console.log(allCookies);
		console.log(getCookie('jsessionid'))
		$('div').text(getCookie('JSESSIONID'));
	});

	function getCookie(name) {
		var value = document.cookie.match('(^|;) ?' + name + '=([^;]*)(;|$)');
        return value? value[2] : null;
	}
</script>
</head>
<body>

	<div></div>

</body>
</html>