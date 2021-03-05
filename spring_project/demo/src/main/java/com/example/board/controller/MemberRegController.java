package com.example.board.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.board.domain.MemberRegRequest;
import com.example.board.service.MemberRegService;

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
			HttpServletRequest request,
			Model model
			) {
		
		System.out.println(regRequest);
		int result = regService.memberReg(regRequest, request);
		
		model.addAttribute("result", result);
		
		return "member/memberRegView";
	}
	
	
	
	
	
	
	
	
	
	
	
}
