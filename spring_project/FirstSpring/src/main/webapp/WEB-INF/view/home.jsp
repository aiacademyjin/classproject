<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<h1>Index</h1>
	
	<ul> 
		<li>
			<c:url value="/hello" var="hello"/>
			<a href="${hello}">${hello}</a>
		</li>
	</ul>


</body>
</html>
