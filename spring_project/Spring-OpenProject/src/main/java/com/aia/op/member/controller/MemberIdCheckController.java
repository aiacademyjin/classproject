package com.aia.op.member.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberIdCheckController {

	@GetMapping
	public String idCheck(
			@RequestParam("id") String id
			) {
		
		String result = "N";
		
		
		
		
		return result;
	}
	
	
}
