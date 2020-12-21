<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	* {
		margin: 0;
		padding: 0;
	}
	
	body {
		padding : 10px;
	}
	
	header, nav, div.contents, footer   {
		width : 800px;
		margin : 0 auto;
		background-color: #EEE;
	}
	
	header {
		padding : 10px 20px;
	}
	
	nav>ul {		
		overflow : hidden;	
		list-style: none;
	}
	
	nav>ul>li {
		float: left;
		padding : 5px 20px;		
	}
	
	div.contents {
		clear : both;
	}
	
	div.contents>h2.content_title {
		
		padding : 10px;
		
	}
	
	hr {
		border : 0;
		border-top: 1px solid #DDD;
	}
	
	
</style>
</head>
<body>

	<header>
		<h1 class="header_title">OPEN PROJECT</h1>
	</header>
		
	<nav>
		<ul>
			<li> <a href="#">HOME</a>  </li>
			<li> <a href="#">HOME</a>  </li>
			<li> <a href="#">HOME</a>  </li>
			<li> <a href="#">HOME</a>  </li>
			<li> <a href="#">HOME</a>  </li>
			<li> <a href="#">HOME</a>  </li>
		</ul>
	</nav>
	
	<div class="contents">
		<h2 class="content_title">index</h2>
		<hr>
		<div class="content">
		인텍스 페이지 입니다.
		</div>
	</div>
	
	
	<footer>
		copyright @aiaacademy 2020
	</footer>
	
	
	
	
	
	
	
	
	


</body>
</html>