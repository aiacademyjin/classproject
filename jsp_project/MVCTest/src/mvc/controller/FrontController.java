package mvc.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	


	private void processRequest(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		// 요청을 분석 : URI 이용해서 분석
		// http://localhost:8080/mvc/greeting -> /greeting
		String command = request.getRequestURI();
		System.out.println(command);
		// /mvc/greeting
		System.out.println(command.indexOf(request.getContextPath()));
		if(command.indexOf(request.getContextPath())==0) {
			command = command.substring(request.getContextPath().length());
		}
		System.out.println(command);
		
		// 요청에 맞는 기능 실행 -> 결과 데이터를 생성
		Object resultObj = null;
		
		if(command.equals("/greeting") | command.equals("/")) {
			resultObj = "환영합니다.";
		} else if(command.equals("/date")) {
			resultObj = new Date();
		} else if(command.equals("/member/login")) {
			resultObj = "로그인 페이지입니다.";
		} else {
			resultObj = "잘못된 요청 경로입니다. 확인 후 다시 시도해주세요.";
		}
		
		// request의 속성에 결과 데이터를 저장
		request.setAttribute("result", resultObj);
		
		// 응답을 위한 View 페이지로 포워딩
		RequestDispatcher dispatcher = request.getRequestDispatcher("/simpleView.jsp");
		dispatcher.forward(request, response);
		
	}
	
	

}
