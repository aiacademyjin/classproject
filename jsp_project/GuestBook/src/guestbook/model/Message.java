package guestbook.model;

import java.sql.Timestamp;
import java.util.Date;

public class Message {

	private int id;
	private String guestName;
	private String password;
	private String message;
	private Timestamp writedate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGuestName() {
		return guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Timestamp getWritedate() {
		return writedate;
	}

	public void setWritedate(Timestamp writedate) {
		this.writedate = writedate;
	}

	// TimeStamp -> java.util.Date
	public Date getToDate() {
		return new Date(writedate.getTime());
	}

	@Override
	public String toString() {
		return "Message [id=" + id + ", guestName=" + guestName + ", password=" + password + ", message=" + message
				+ ", writedate=" + writedate + "]";
	}

}
