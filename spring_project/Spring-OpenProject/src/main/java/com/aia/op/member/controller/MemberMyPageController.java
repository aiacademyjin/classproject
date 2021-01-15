package com.aia.op.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mypage")
public class MemberMyPageController {

	@RequestMapping("/mypage1") // /op/mypage/mypage1
	public String myPage1() {
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





