package guestbook.service;

import java.sql.Connection;
import java.sql.SQLException;

import guestbook.dao.MessageDao;
import guestbook.model.MessageListView;
import jdbc.ConnectionProvider;

public class GetMessageListService {

	// 싱글톤 패턴 적용
	private GetMessageListService() {}
	private static GetMessageListService service = new GetMessageListService();
	public static GetMessageListService getInstance() {
		return service;
	}
	
	// MessageListView 객체를 반환하는 메소드
	// 페이지번호를 받아서 해당 페이지를 출력할 데이터를 만들어야 한다.
	public MessageListView getMessageList(int pageNumber) {
		
		MessageListView listView = null;
		
		// MessageListView 가 가지는 변수의 데이터들을 MessageDao를 이용해서 생성
		Connection conn = null;
		MessageDao dao = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			dao = MessageDao.getInstance();
			
			// 게시물의 전체 개수 -> 페이지 개수
			int totalPageCount = dao.selectAllcount(conn);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return listView;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
