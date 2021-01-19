package com.aia.firstspring.member.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aia.firstspring.member.dao.MemberInterfaceDao;
import com.aia.firstspring.member.domain.Member;

@Service
public class MemberRestService {
	
	private MemberInterfaceDao dao;
	
	@Autowired
	private SqlSessionTemplate template;

	public Member getMember(int idx) {
		dao = template.getMapper(MemberInterfaceDao.class);
		return dao.selectByIdx(idx);
	}
}






