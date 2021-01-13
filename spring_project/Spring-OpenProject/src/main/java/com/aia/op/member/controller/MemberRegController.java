package com.aia.op.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aia.op.member.domain.MemberRegRequest;

@Controller
@RequestMapping("/member/reg")
public class MemberRegController {

	@RequestMapping(method = RequestMethod.GET)
	public String getRegForm() {
		return "member/memberRegForm";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String memberReg(
			@ModelAttribute("regData") MemberRegRequest regRequest
			) {
		
		System.out.println(regRequest);
		
		return "member/memberRegView";
	}
	
	
	
	
	
	
	
	
	
	
	
}
