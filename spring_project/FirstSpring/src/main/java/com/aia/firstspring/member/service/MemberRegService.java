package com.aia.firstspring.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aia.firstspring.member.dao.MemberDao;
import com.aia.firstspring.member.domain.Member;

@Service
public class MemberRegService {

	@Autowired
	private MemberDao dao;
	
	
	public int insertMember(Member member) {
		return dao.insertMember(member);
	}
	
	
	
	
	
	
	
	
	
	
}
