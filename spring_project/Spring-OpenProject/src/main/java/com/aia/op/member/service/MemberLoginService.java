package com.aia.op.member.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aia.op.member.dao.MemberDao;
import com.aia.op.member.domain.Member;

@Service
public class MemberLoginService {
	
	private MemberDao dao;
	
	@Autowired
	private SqlSessionTemplate template;

	public boolean login(
			HttpServletRequest request,
			HttpServletResponse response) {
		
		String id = request.getParameter("userid");
		String pw = request.getParameter("pw");
		String chk = request.getParameter("chk");
		
		dao = template.getMapper(MemberDao.class);
		
		boolean loginCheck = false;
		
		// 1. Dao -> id, pw 데이터로 검색 => 존재하면 로그인 처리
		
		Member member = dao.selectLogin(id, pw);
		
		System.out.println(member);
		
		if(member != null) {
			System.out.println("id/pw 일치");
			
		} 
		
		
		
		// 2. uid 쿠키 처리
		
		
		return loginCheck;
	}
	
}
