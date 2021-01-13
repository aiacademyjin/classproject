package com.aia.op.member.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aia.op.member.domain.MemberRegRequest;
import com.aia.op.member.service.MemberRegService;

@Controller
@RequestMapping("/member/reg")
public class MemberRegController {
	
	@Autowired
	private MemberRegService regService;

	@RequestMapping(method = RequestMethod.GET)
	public String getRegForm() {
		return "member/memberRegForm";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String memberReg(
			@ModelAttribute("regData") MemberRegRequest regRequest,
			HttpServletRequest request
			) {
		
		System.out.println(regRequest);
		regService.memberReg(regRequest, request);
		
		return "member/memberRegView";
	}
	
	
	
	
	
	
	
	
	
	
	
}
