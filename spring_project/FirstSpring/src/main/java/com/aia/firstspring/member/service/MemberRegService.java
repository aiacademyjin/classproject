package com.aia.firstspring.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aia.firstspring.member.dao.MemberDao;
import com.aia.firstspring.member.dao.MybatisMemberDao;
import com.aia.firstspring.member.domain.Member;

@Service
public class MemberRegService {

//	@Autowired
//	private MemberDao dao;
	
	@Autowired
	private MybatisMemberDao dao;
	
	
	public int insertMember(Member member) {
		int result = 0;
		try {
			result = dao.insertMember(member);
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		return result;
	}
	
	
	
	
	
	
	
	
	
	
}
