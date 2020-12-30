package mvc.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.command.Command;
import mvc.command.DateCommand;
import mvc.command.GreetingCommand;
import mvc.command.InvalidCommand;
import mvc.command.MemberLoginCommand;

public class FrontController extends HttpServlet {
	
	// Map<String, Command> -> 요청 uri, Command 클래스를 상속하는 객체
	private Map<String, Command> commands;

	@Override
	public void init(ServletConfig config) throws ServletException {
		
		commands = new HashMap<String, Command>();
		
		String configPath = config.getInitParameter("configPath");
		
		Properties prop = new Properties();
		
		FileInputStream fis = null;
		// 설정 파일의 시스템의 실제 경로
		String configFilepath = config.getServletContext().getRealPath(configPath);
		
		
		try {
			fis = new FileInputStream(configFilepath);
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Iterator itr = prop.keySet().iterator();
		
		while(itr.hasNext()) {
			String command = (String) itr.next();
			String className = prop.getProperty(command);
			
			// commands Map -> command, className의 인스턴스를 저장
			try {
				Class commandClass = Class.forName(className);
				// Command 인스턴스 생성
				Command commandInstance = (Command) commandClass.newInstance();
				
				// command.put(경로, Command 인스턴스)
				commands.put(command, commandInstance);
				
				System.out.println(command+"="+className);
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
		
		
		
		
		/*
		 * commands = new HashMap<String, Command>(); 
		 * commands.put("/", new GreetingCommand()); 
		 * commands.put("/greeting", new GreetingCommand());
		 * commands.put("/date", new DateCommand()); 
		 * commands.put("/member/login", new MemberLoginCommand());
		 */
		
	}

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
		//Object resultObj = null;
		
		Command cmd = commands.get(command);
		
		if(cmd==null) {
			cmd = new InvalidCommand();
		}
		String viewPage = cmd.getViewPage(request, response);
		
		// 응답을 위한 View 페이지로 포워딩
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
		
	}
	
	

}
