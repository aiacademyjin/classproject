package com.aia.board.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aia.board.dao.MemberDao;

@Service
public class MemberDeleteService {

	private MemberDao dao;
	
	@Autowired
	private SqlSessionTemplate template;
	
	public int deleteMember(int idx) {
		
		dao = template.getMapper(MemberDao.class);
		
		return dao.deleteMemberByIdx(idx);
		
	}
	
}







