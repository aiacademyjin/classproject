package com.aia.firstspring.member.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aia.firstspring.member.dao.MemberDao;
import com.aia.firstspring.member.dao.MemberInterfaceDao;
import com.aia.firstspring.member.dao.MybatisMemberDao;
import com.aia.firstspring.member.domain.Member;

@Service
public class MemberListService {
	
//	@Autowired
//	MemberDao dao;
	
	// @Autowired
	// private MybatisMemberDao dao; 
	
	private MemberInterfaceDao dao;
	
	@Autowired
	private SqlSessionTemplate template;
	
//	public MemberListService(MemberDao dao) {
//		this.dao=dao;
//	}

	public List<Member> getMemberList(){
		
		dao = template.getMapper(MemberInterfaceDao.class);
		
		return dao.selectMemberList();
	}
	
	public int getmemberTotalCount() {
		dao = template.getMapper(MemberInterfaceDao.class);
		return dao.totalCnt();
		//return 0;
	}
	
}







