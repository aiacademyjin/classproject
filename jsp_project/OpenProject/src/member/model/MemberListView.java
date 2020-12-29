package member.model;

import java.util.List;

public class MemberListView {

	private int memberTotalCount;
	private int memberCountPerPage;
	private List<Member> memberList;
	private int pageTotalCount;
	private int firstRow;
	private int pageNumber;

	public MemberListView(int memberTotalCount, int memberCountPerPage, List<Member> memberList, int firstRow,
			int pageNumber) {
		this.memberTotalCount = memberTotalCount;
		this.memberCountPerPage = memberCountPerPage;
		this.memberList = memberList;
		this.firstRow = firstRow;
		this.pageNumber = pageNumber;
		calTotalPageCount();
	}

	private void calTotalPageCount() {
		if (memberTotalCount == 0) {
			pageTotalCount = 0;
		} else {
			pageTotalCount = memberTotalCount / memberCountPerPage;
			pageTotalCount = memberTotalCount % memberCountPerPage > 0 ? ++pageTotalCount : pageTotalCount;
			// pageTotalCount = pageTotalCount++
			
		}
	}

	public int getMemberTotalCount() {
		return memberTotalCount;
	}

	public int getMemberCountPerPage() {
		return memberCountPerPage;
	}

	public List<Member> getMemberList() {
		return memberList;
	}

	public int getPageTotalCount() {
		return pageTotalCount;
	}

	public int getFirstRow() {
		return firstRow;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	@Override
	public String toString() {
		return "MemberListView [memberTotalCount=" + memberTotalCount + ", memberCountPerPage=" + memberCountPerPage
				+ ", memberList=" + memberList + ", pageTotalCount=" + pageTotalCount + ", firstRow=" + firstRow
				+ ", pageNumber=" + pageNumber + "]";
	}
	
	
	

}
