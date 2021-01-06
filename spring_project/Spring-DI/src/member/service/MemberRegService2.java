package member.service;

import org.springframework.beans.factory.annotation.Autowired;

import member.dao.Dao;

public class MemberRegService2 implements MemberService  {

	@Autowired
	private Dao dao; // 주입 받아야 하는 참조 변수
	
	@Override
	public Object process() {
		System.out.println("MemberRegService 실행");
		dao.insert();
		return null;
	}

}
