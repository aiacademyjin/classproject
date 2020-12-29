package guestbook.exception;

public class InvalidMessagePasswordException extends Exception{

	public InvalidMessagePasswordException() {
		super("비밀번호가 일치하지 않습니다.");
	}
	
}
