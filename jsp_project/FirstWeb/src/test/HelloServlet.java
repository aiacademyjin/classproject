package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		// 응답 : html 생성 반환
		// 응답 관련 객체 : HttpServletResponse response
		
		// 컨텐트 타입과 케릭터셋 설정
		response.setContentType("text/html; charset=UTF-8");
		
		// 응답처리에 사용할 날짜와 시간데이터
		Date now = new Date();
		
		// HTML의 응답처리를 위한 스트림 생성
		PrintWriter writer = response.getWriter(); 
		
		// 응답 데이터를 출력 : html 구조
		writer.println("<html>");
		writer.println("<head><title>now Date</title></head>");
		writer.println("<body>");
		writer.println("<h1> 현재시간 : ");
		writer.println(now);  // now.toString()
		writer.println("</h1>");
		writer.println("<h1>서블릿에서 생성된 응받 코드입니다.</h1>");
		writer.println("<body>");
		writer.println("</body>");
		writer.println("</html>");
		
		writer.close();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
