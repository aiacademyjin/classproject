package com.aia.firstspring.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class GuestMessageList2 {

	private List<GuestMessage2> message;
	
	public GuestMessageList2() {
	}

	public GuestMessageList2(List<GuestMessage2> message) {
		this.message = message;
	}

	public List<GuestMessage2> getMessage() {
		return message;
	}

	public void setMessage(List<GuestMessage2> message) {
		this.message = message;
	}

}
