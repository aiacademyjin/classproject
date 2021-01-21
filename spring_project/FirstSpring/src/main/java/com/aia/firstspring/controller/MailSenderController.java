package com.aia.firstspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mail")
public class MailSenderController {
	
	@Autowired
	private JavaMailSender mailSender;

	@RequestMapping("/simplemail")  //    /mail/simplemail
	public void simpleMailSend() {
		
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo("ryuyj76@naver.com");
		message.setSubject("테스트 이메일 발송입니다.");
		message.setText("내용입니다.");
		
		mailSender.send(message);
		
		 // return "mail/simplemail";
	}
	
	
	
}
