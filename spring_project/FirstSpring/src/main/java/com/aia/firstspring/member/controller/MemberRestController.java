package com.aia.firstspring.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aia.firstspring.member.service.MemberRestService;

@Controller
public class MemberRestController {
	
	@Autowired
	private MemberRestService restService;
	
	@RequestMapping("/members/{idx}")
	public String mypage(
			@PathVariable("idx") int idx,
			Model model
			) {
		System.out.println(idx);
		model.addAttribute("idx", idx);
		model.addAttribute("member", restService.getMember(idx));
		return "member/mypage";
	}

}
