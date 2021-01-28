package com.aia.op.member.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aia.op.member.dao.MemberDao;
import com.aia.op.member.domain.Member;
import com.aia.op.member.domain.MemberListView;
import com.aia.op.member.domain.SearchParam;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
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
			log.info(list);


		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

}
