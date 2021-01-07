package com.aia.firstspring.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/member/login")
public class MemberLoginController {
	
	// @RequestMapping(value = "/member/login", method = RequestMethod.GET)
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView getLoginForm() {
		return new ModelAndView("member/loginForm");
	}
	
	//@RequestMapping(value = "/member/login", method = RequestMethod.POST)
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView login(
			@RequestParam("uid") String uid, 
			@RequestParam("pw") String pw) {
		
		// login("cool", "1111")
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/member/login");
		mav.addObject("uid", uid);
		mav.addObject("pw", pw);
		
		return mav; 
	}

}
