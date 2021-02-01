package com.aia.openapi.domain;

public class ResponseDataBody {

	private String dataType;
	private ResponseDataItems items;
	private int pageNo;
	private int numOfRows;
	private int totalCount;

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public ResponseDataItems getItems() {
		return items;
	}

	public void setItems(ResponseDataItems items) {
		this.items = items;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getNumOfRows() {
		return numOfRows;
	}

	public void setNumOfRows(int numOfRows) {
		this.numOfRows = numOfRows;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	@Override
	public String toString() {
		return "ResponseDataBody [dataType=" + dataType + ", items=" + items + ", pageNo=" + pageNo + ", numOfRows="
				+ numOfRows + ", totalCount=" + totalCount + "]";
	}
	
	

}
