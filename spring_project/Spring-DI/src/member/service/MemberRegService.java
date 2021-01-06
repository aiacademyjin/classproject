package member.service;

import member.dao.Dao;
import member.dao.MemberDao;

public class MemberRegService implements MemberService  {

	Dao dao = new MemberDao(); // 의존성이 높은 코드
	
	@Override
	public Object process() {
		System.out.println("MemberRegService 실행");
		
		dao.insert();
		
		return null;
	}

}
