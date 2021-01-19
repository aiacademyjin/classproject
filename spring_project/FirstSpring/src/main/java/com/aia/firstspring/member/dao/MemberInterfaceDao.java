package com.aia.firstspring.member.dao;

import java.util.List;

import com.aia.firstspring.member.domain.Member;

public interface MemberInterfaceDao {

	// abstract public 생략
	List<Member> selectMemberList();
	int insertMember(Member member);
	int totalCnt();
	Member selectByIdPw();
	Member selectByIdx(int idx);
}
