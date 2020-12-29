package guestbook.service;

import java.sql.Connection;
import java.sql.SQLException;

import guestbook.dao.MessageDao;
import guestbook.model.Message;
import jdbc.ConnectionProvider;
import jdbc.JdbcUtil;

public class DeleteMessageService {

	// 싱글톤 패턴
	private DeleteMessageService() {
	}

	private static DeleteMessageService service = new DeleteMessageService();

	public static DeleteMessageService getInstance() {
		return service;
	}

	// 게시물의 아이디, 비밀번호를 받아서 삭제하고 결과를 반환
	public int deleteMessage(int mid, String pw) throws Exception {
		int resultCnt = 0;

		// Connection, MessageDao,
		// selectMessage(conn, mid) -> Message : 게시물 존재 유무, 비밀번호 일치 체크
		// deleteMessage(conn, mid) : 게시물 삭제

		Connection conn = null;
		MessageDao dao = null;

		try {
			conn = ConnectionProvider.getConnection();

			// autoCommit -> false
			conn.setAutoCommit(false); // default -> true

			dao = MessageDao.getInstance();

			Message message = dao.selectMessage(conn, mid); // Message 객체, null

			if (message == null) {
				// 메시지가 존재하지 않는다.
				// 예외발생
				throw new Exception("메시지가 존재하지 않습니다.");
				
			} else if (message.getPassword().equals(pw)) {
				// 메시지가 존재하고 비밀번호도 같다. -> 게시물을 삭제
				dao.deleteMessage(conn, mid);

				conn.commit();
			} else {
				// 메시지는 존재하지만 비밀번호가 틀리다.
				// 예외 발생
				throw new Exception("비밀번호가 일치하지 않습니다.");
			}

		} catch (SQLException e) {
			JdbcUtil.rollback(conn);
			throw e;
			//e.printStackTrace();
		} catch (Exception e) {
			JdbcUtil.rollback(conn);
			throw e;
		}

		return resultCnt;
	}

}
