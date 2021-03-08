package com.aia.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mypage")
public class MemberMyPageController {
	

	

	@RequestMapping("/mypage1") // /op/mypage/mypage1
	public String myPage1(@CookieValue("JSESSIONID") String sessionId) {
		
		sessionId = "B1C8D4D2EDD95B731F973432F5F66A1C";
		
		//System.out.println("redis data : "+redisService.getUserInformation(sessionId));
		
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





