package com.aia.firstspring.member.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aia.firstspring.member.dao.MemberDao;
import com.aia.firstspring.member.dao.MemberInterfaceDao;
import com.aia.firstspring.member.dao.MybatisMemberDao;
import com.aia.firstspring.member.domain.Member;
import com.aia.firstspring.service.MailSenderService;

@Service
public class MemberRegService {

//	@Autowired
//	private MemberDao dao;
	
//	@Autowired
//	private MybatisMemberDao dao;
	
	private MemberInterfaceDao dao;
	
	@Autowired
	private SqlSessionTemplate template;
	
	@Autowired
	private MailSenderService mailSenderService; 
	
	
	public int insertMember(Member member) {
		int result = 0;
		try {
			dao = template.getMapper(MemberInterfaceDao.class);
			result = dao.insertMember(member);
			
			String html = "<h1>아래 링크를 통해 인증해주세요."
					+ " <a href=\"http://localhost:8080/firstspring\"> 인증하기 </a> </h1>";
			
			// 메일 전송
			mailSenderService.mailSend(
					member.getMemberid(), 
					member.getMembername(), 
					"[안내] 회원가입을 위한 계정 인증 안내", 
					html);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		return result;
	}
	
	
	
	
	
	
	
	
	
	
}
