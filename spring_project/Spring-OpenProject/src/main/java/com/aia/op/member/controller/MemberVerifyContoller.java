package com.aia.op.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberVerifyContoller {

	@RequestMapping("/member/verify")
	public void memberVerify(
			@RequestParam("id") int idx,
			@RequestParam("code") String code,
			Model model
			) {
		
		
		
		// /WEB-INF/views/member/verify.jsp
	}
	
}
