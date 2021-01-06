package member.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import member.dao.Dao;

public class MemberInfoService3 implements MemberService {

	@Resource(name = "memberDao")
	Dao dao ;
	
	@Override
	public Object process() {
		System.out.println("MemberInfoService 인스턴스 실행");
		dao.select();
		return null;
	}

}
