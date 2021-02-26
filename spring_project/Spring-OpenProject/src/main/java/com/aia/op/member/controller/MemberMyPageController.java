package com.aia.op.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aia.op.member.service.RedisService;

@Controller
@RequestMapping("/mypage")
public class MemberMyPageController {
	
	
	@Autowired
	private RedisService redisService;
	

	@RequestMapping("/mypage1") // /op/mypage/mypage1
	public String myPage1(@CookieValue("JSESSIONID") String sessionId) {
		
		sessionId = "ABDF3EFCF8107976E0969BB65C5904C5";
		
		System.out.println("redis data : "+redisService.getUserInformation(sessionId));
		
		return "member/mypage";
	}
	
	@RequestMapping("/mypage2") // /op/mypage/mypage2
	public String myPage2() {
		return "member/mypage";
	}
	
	@RequestMapping("/mypage3") // /op/mypage/mypage3
	public String myPage3() {
		
		String str = "null";
		str.charAt(1);
		
		return "member/mypage";
	}
	
	@ExceptionHandler(NullPointerException.class)
	public String handleNullPointerException(NullPointerException e) {
		e.printStackTrace();
		return "error/nullPointer";
	}
	
}





