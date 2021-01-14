package com.aia.op.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aia.op.member.service.MemberDeleteService;

@Controller
public class MemberDeleteController {
	
	@Autowired
	private MemberDeleteService deleteService;
	
	@RequestMapping("/member/delete")
	public String deleteMember(
			@RequestParam("idx") int idx,
			Model model
			) {
		
		// 0 or 1
		model.addAttribute("result", deleteService.deleteMember(idx));
		
		return "member/delete";
	}

}
