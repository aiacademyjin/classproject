package com.aia.op.member.dao;

import java.util.List;

import com.aia.op.member.domain.Member;
import com.aia.op.member.domain.SearchParam;

public interface MemberDao {

	// public abstract
	// 회원 등록
	int insertMember(Member member);
	// 로그인
	Member selectLogin(String id, String pw);
	// 회원의 총 수
	int selectTotalCount();
	// 회원 리스트(페이지 번호에 맞는)
	List<Member> selectMemberList(int startRow, int cntPerPage);
	
	// 검색한 회원의 수
	int selectSearchMemberCount(SearchParam param);
}









