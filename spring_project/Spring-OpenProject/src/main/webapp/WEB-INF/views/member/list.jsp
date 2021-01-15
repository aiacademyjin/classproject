<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 리스트</title>
<%@ include file="/WEB-INF/views/include/basicset.jsp" %>
<style>
	.table {
		/* border: 1px solid #DDD; */
		width : 100%;
	}
	
	td, th {
		border-bottom: 1px solid #DDD;
		text-align: center;
		padding: 10px 0; 
	}
	.nowpage {
		font-size: 1.5em;
		font-weight: bold;
	}
	
	.paging {
		text-align: center;
	}
	
	div.searchBox {
		border: 1px solid #CCC;
		margin: 15px 0;
		padding: 10px 20px;
		background-color: #EEE;
	}
	
</style>
</head>
<body>
	<%@ include file="/WEB-INF/views/include/header.jsp"%>
	<%@ include file="/WEB-INF/views/include/nav.jsp"%>

	<div class="contents">
		<h2 class="content_title">회원 리스트</h2>
		<hr>
		<div class="content"> 
			
			<div class="searchBox">
				<form>
					검색 타입
					<select name="searchType">
						<option value="id">아이디</option>
						<option value="name">이름</option>
						<option value="both">아이디+이름</option>
					</select>		
					검색 키워드
					<input type="text" name="keyword">
					<input type="submit" value="검색">		
				</form>
			</div>
			
			<table class="table">
				<tr>
					<th>idx</th>
					<th>Member ID</th>
					<th>Member Name</th>
					<th>Member Photo</th>
					<th>Member RegistDate</th>
					<th>Manage</th>
				</tr>
				
				<c:forEach items="${listView.memberList}" var="member">
				<tr>
					<td>${member.idx}</td>
					<td>${member.memberid}</td>
					<td>${member.membername}</td>
					<td> 
						<img height="30" alt="프로필 사진" src="<c:url value="/fileupload/member/${member.memberphoto}"/>">
					</td>
					<td>
						<fmt:formatDate value="${member.regdate}" pattern="yyyy.MM.dd."/>
					</td>
					<td>  
						<a href="<c:url value="/member/edit?idx=${member.idx}"/>">수정</a> 
						<a href="javascript:deleteMember(${member.idx});">삭제</a>
					</td>
				</tr>
				</c:forEach>
				
			</table>			
			
			<div class="paging">
				<c:if test="${listView.totalMemberCount>0}">
				<c:forEach begin="1" end="${listView.totalPageCount}" var="num">
				[ <a href="<c:url value="/member/list"/>?p=${num}&searchType=${param.searchType}&keyword=${param.keyword}" 
						 class="${listView.pageNumber eq num ? 'nowpage' : ''}">${num}</a> ] 				
				</c:forEach>
				</c:if>
			</div>
			
		</div>
	</div>

	<%@ include file="/WEB-INF/views/include/footer.jsp"%>



<script>

	function deleteMember(idx){
		
		if(confirm('정말로 삭제하시겠습니까?')){
			location.href = '<c:url value="/member/delete?idx="/>'+idx;
		}   // /op/member/delete?idx
		
	}

</script>







</body>
</html>