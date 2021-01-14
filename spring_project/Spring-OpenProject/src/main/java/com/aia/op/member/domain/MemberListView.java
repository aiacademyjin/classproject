package com.aia.op.member.domain;

import java.util.List;

public class MemberListView {

	private int pageNumber; // 현재 페이지 번호
	private int totalMemberCount; // 전체 게시물의 개수
	private int cntPerPage; // 한 페이지에 노출할 게시물의 개수
	private List<Member> memberList; // 페이지에 노출할 회원의 정보를 담는 리스트
	private int startRow;
	private int endRow;
	private int totalPageCount; // 전체 페이지의 개수

	public MemberListView(int pageNumber, int totalMemberCount, int cntPerPage, List<Member> memberList, int startRow,
			int endRow) {
		this.pageNumber = pageNumber;
		this.totalMemberCount = totalMemberCount;
		this.cntPerPage = cntPerPage;
		this.memberList = memberList;
		this.startRow = startRow;
		this.endRow = endRow;
		calTotalPageCount();
	}

	private void calTotalPageCount() {
		
		totalPageCount = totalMemberCount/cntPerPage;
		if(totalMemberCount%cntPerPage>0) {
			totalPageCount++;
		}
		
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public int getTotalMemberCount() {
		return totalMemberCount;
	}

	public int getCntPerPage() {
		return cntPerPage;
	}

	public List<Member> getMemberList() {
		return memberList;
	}

	public int getStartRow() {
		return startRow;
	}

	public int getEndRow() {
		return endRow;
	}

	public int getTotalPageCount() {
		return totalPageCount;
	}

	@Override
	public String toString() {
		return "MemberListView [pageNumber=" + pageNumber + ", totalMemberCount=" + totalMemberCount + ", cntPerPage="
				+ cntPerPage + ", memberList=" + memberList + ", startRow=" + startRow + ", endRow=" + endRow
				+ ", totalPageCount=" + totalPageCount + "]";
	}
	
}
