package com.aia.board.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aia.board.dao.MemberDao;

@Service
public class MemberIdCheckService {
	
	private MemberDao dao;
	
	@Autowired
	private SqlSessionTemplate template;

	public String chekId(String id) {

		dao = template.getMapper(MemberDao.class);
		
		return dao.selectMemberByIdCount(id)>0 ? "N" : "Y" ;
		
	}
	
	
}
