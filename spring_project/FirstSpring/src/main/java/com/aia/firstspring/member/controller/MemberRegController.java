package com.aia.firstspring.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aia.firstspring.member.domain.Member;
import com.aia.firstspring.member.service.MemberRegService;

@Controller
@RequestMapping("/member/reg")
public class MemberRegController {
	
	@Autowired
	private MemberRegService regService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String getRegForm() {
		return "member/regForm";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String memberReg(Member member, Model model) {
		
		int resultCnt = regService.insertMember(member);
		
		model.addAttribute("resultCnt", resultCnt);
		
		String view = "member/reg";
		
		if(resultCnt==1) {
			view = "redirect:/member/list";
		}
		
		return view;
	}
	

}







