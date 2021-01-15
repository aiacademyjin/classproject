package com.aia.op.member.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aia.op.member.dao.MemberDao;
import com.aia.op.member.domain.Member;

@Service
public class MemberEditService {
	
	private MemberDao dao;
	
	@Autowired
	private SqlSessionTemplate template;
	
	
	public Member getMember(int idx) {
		
		dao = template.getMapper(MemberDao.class);
		
		return dao.selectMemberByIdx(idx);
	}

}
