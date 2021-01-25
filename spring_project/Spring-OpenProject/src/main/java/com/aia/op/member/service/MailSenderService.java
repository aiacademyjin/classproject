package com.aia.op.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.aia.op.member.domain.Member;

@Service
public class MailSenderService {
	
	@Autowired
	private JavaMailSender sender;
	
	public int send(Member member) {
		
		return 0;
	}

}
