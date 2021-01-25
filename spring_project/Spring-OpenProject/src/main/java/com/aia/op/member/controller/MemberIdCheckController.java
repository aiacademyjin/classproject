package com.aia.op.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aia.op.member.service.MemberIdCheckService;

@RestController
public class MemberIdCheckController {
	
	@Autowired
	private MemberIdCheckService idCheckService;

	@GetMapping("/member/idcheck")    // /op/member/idcheck?id=cool@gmail.com
	public String idCheck(
			@RequestParam("id") String id
			) {
		return idCheckService.chekId(id);
	}
	
	
}
