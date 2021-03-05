package com.example.board.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.board.dao.MemberDao;
import com.example.board.domain.Member;
import com.example.board.domain.MemberListView;
import com.example.board.domain.SearchParam;

@Service
public class MemberListService {

	private MemberDao dao;

	@Autowired
	private SqlSessionTemplate template;

	public MemberListView getListView(SearchParam param) {

		MemberListView listView = null;

		try {
			// MemberDao 구현체 생성
			dao = template.getMapper(MemberDao.class);

			System.out.println("pageNumber : " + param.getP());

			int cntPerPage = 5;

			int startRow = (param.getP() - 1) * cntPerPage;
			int endRow = startRow + cntPerPage - 1;

			Map<String, Object> listMap = new HashMap<String, Object>();
			listMap.put("index", startRow);
			listMap.put("count", cntPerPage);
			listMap.put("searchParam", param);

			// int totalMemberCount = dao.selectTotalCount();
			int totalMemberCount = dao.selectSearchMemberCount(listMap);
			System.out.println("memberTotalCount : " + totalMemberCount);

			List<Member> memberList = dao.selectMemberList(listMap);
			System.out.println(memberList);

			listView = new MemberListView(param.getP(), totalMemberCount, cntPerPage, memberList, startRow, endRow);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return listView;
	}
	
	public List<Member> getListView() {

		List<Member> list = null;

		try {
			// MemberDao 구현체 생성
			dao = template.getMapper(MemberDao.class);

			list = dao.selectAllMemberList();
			//System.out.println(list);


		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

}
