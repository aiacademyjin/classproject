<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<nav class="navbar navbar-expand-lg fixed-top navbar-dark bg-dark" aria-label="Main navigation">
  
  <div class="container-fluid">
    <a class="navbar-brand" href="#">OpenProject</a>
    <button class="navbar-toggler p-0 border-0" type="button" data-bs-toggle="offcanvas" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>

    <div class="navbar-collapse offcanvas-collapse" id="navbarsExampleDefault">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item active">
          <a class="nav-link" aria-current="page" href="<c:url value="/"/>">HOME</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="<c:url value="/member/reg"/>">회원가입</a>
        </li>        
        <li class="nav-item">
        <c:if test="${loginInfo eq null}">
          <a class="nav-link" href="<c:url value="/member/login"/>">LOGIN</a>
        </c:if>
        <c:if test="${loginInfo ne null}">          
          <a class="nav-link" href="<c:url value="/member/logout"/>">LOGOUT</a>
        </c:if>          
        </li>
        <li class="nav-item">
          <a class="nav-link" href="<c:url value="/mypage/mypage1"/>">My page1</a>
        </li>  
        <li class="nav-item">
          <a class="nav-link" href="<c:url value="/mypage/mypage2"/>">My page2</a>
        </li>  
        <li class="nav-item">
          <a class="nav-link" href="<c:url value="/mypage/mypage3"/>">My page3</a>
        </li>  
        <li class="nav-item">
          <a class="nav-link" href="<c:url value="/member/list"/>">회원 리스트</a>
        </li>  
        <li class="nav-item">
          <a class="nav-link" href="#">방명록</a>
        </li>
      </ul>
    </div>
  </div>
</nav>
