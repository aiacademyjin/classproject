package listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DBCPInitListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent contextEvent) {
		
		ServletContext context = contextEvent.getServletContext();
		
		String driver = context.getInitParameter("jdbcDriver");
		
		try {
			Class.forName(driver);
			System.out.println("tomcat Listener 에서 데이터베이스 드라이버 로드 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("tomcat Listener 에서 데이터베이스 드라이버 로드 실패");
			e.printStackTrace();
		}
		
		System.out.println("초기화 완료.");
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent contextEvent) {
		// TODO Auto-generated method stub

	}
}
