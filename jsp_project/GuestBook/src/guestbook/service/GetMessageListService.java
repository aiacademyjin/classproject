package guestbook.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import guestbook.dao.MessageDao;
import guestbook.model.Message;
import guestbook.model.MessageListView;
import jdbc.ConnectionProvider;

public class GetMessageListService {

	private final int messageCountPerPage = 3;
	
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
			int totalMessageCount = dao.selectAllcount(conn);
			
			// 현재 페이지의 메시지 리스트 구하기
			List<Message> messageList = null;
			int firstRow = 0;
			int endRow = 0;
			
			firstRow = (pageNumber-1)*messageCountPerPage;
			endRow = firstRow+messageCountPerPage-1;
			
			messageList = dao.selectList(conn, firstRow, messageCountPerPage);
			
			listView = new MessageListView(totalMessageCount, pageNumber, messageList, messageCountPerPage, firstRow, endRow);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return listView;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
