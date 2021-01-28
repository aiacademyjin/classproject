package com.aia.op.member.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aia.op.member.domain.Member;
import com.aia.op.member.service.MemberListService;

@RestController
@RequestMapping("/rest/ver1/members")
public class MemberRestController {
	
	@Autowired
	MemberListService listService;
	
	// LIST
	@GetMapping
	@CrossOrigin
	public List<Member> getMemberList(){
		return listService.getListView();
	}
	
	// 1개의 회원 정보 Member
	
	// 회원 정보의 저장
	
	// 회원 정보 수정
	
	// 회원 정보 삭제
	
	// 회원 존재 유무

}
