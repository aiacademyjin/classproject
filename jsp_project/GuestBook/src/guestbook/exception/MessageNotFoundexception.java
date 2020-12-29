package guestbook.exception;

public class MessageNotFoundexception extends Exception {

	public MessageNotFoundexception() {
		super("게시물이 존재하지 않습니다.");
	}

}
