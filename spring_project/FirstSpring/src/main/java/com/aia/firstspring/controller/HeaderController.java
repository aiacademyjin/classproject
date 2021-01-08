package com.aia.firstspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HeaderController {

	@RequestMapping("/header/header")
	public String getHeader(
			@RequestHeader("referer") String re,
			Model model
			) {
		
		System.out.println(re);
		
		model.addAttribute("re", re);
		
		return "header/headerInfo";
	}
	
}
