package com.aia.op.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aia.op.member.service.MemberListService;

@Controller
public class MemberListController {

	@Autowired
	private MemberListService listService;
	
	@RequestMapping("/member/list") // /member/list
	public String memberList(
			@RequestParam(value = "p", defaultValue = "1") int page,
			Model model 
			) {
		
		//MemberListView listView = listService.getListView(page);
		//System.out.println(listView);
		model.addAttribute("listView", listService.getListView(page));
		
		return "member/list";
	}
	
}
