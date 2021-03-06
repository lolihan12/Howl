package com.kh.mohagee.showBoard.model.vo;

import java.sql.Date;

public class sbComment {
	
	   private int bcNo;
	   private int bNo;
	   private int userNo;
	   private String bcContent;
	   private Date bcDate;
	   private int bcLevel;
	   private String bcStatus;
	   private int bbcNo;
	   private String nickName;
	   private String pRenamedFileName;
	   
	   
	public sbComment() {
		super();
	}


	public sbComment(int bcNo, int bNo, int userNo, String bcContent, Date bcDate, int bcLevel, String bcStatus,
			int bbcNo, String nickName, String pRenamedFileName) {
		super();
		this.bcNo = bcNo;
		this.bNo = bNo;
		this.userNo = userNo;
		this.bcContent = bcContent;
		this.bcDate = bcDate;
		this.bcLevel = bcLevel;
		this.bcStatus = bcStatus;
		this.bbcNo = bbcNo;
		this.nickName = nickName;
		this.pRenamedFileName = pRenamedFileName;
	}

	

	public sbComment(int bNo, int userNo, String bcContent) {
		super();
		this.bNo = bNo;
		this.userNo = userNo;
		this.bcContent = bcContent;
	}

	

	public sbComment(int bNo, int userNo, String bcContent, int bbcNo) {
		super();
		this.bNo = bNo;
		this.userNo = userNo;
		this.bcContent = bcContent;
		this.bbcNo = bbcNo;
	}


	public int getBcNo() {
		return bcNo;
	}


	public void setBcNo(int bcNo) {
		this.bcNo = bcNo;
	}


	public int getbNo() {
		return bNo;
	}


	public void setbNo(int bNo) {
		this.bNo = bNo;
	}


	public int getUserNo() {
		return userNo;
	}


	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}


	public String getBcContent() {
		return bcContent;
	}


	public void setBcContent(String bcContent) {
		this.bcContent = bcContent;
	}


	public Date getBcDate() {
		return bcDate;
	}


	public void setBcDate(Date bcDate) {
		this.bcDate = bcDate;
	}


	public int getBcLevel() {
		return bcLevel;
	}


	public void setBcLevel(int bcLevel) {
		this.bcLevel = bcLevel;
	}


	public String getBcStatus() {
		return bcStatus;
	}


	public void setBcStatus(String bcStatus) {
		this.bcStatus = bcStatus;
	}


	public int getBbcNo() {
		return bbcNo;
	}


	public void setBbcNo(int bbcNo) {
		this.bbcNo = bbcNo;
	}


	public String getNickName() {
		return nickName;
	}


	public void setNickName(String nickName) {
		this.nickName = nickName;
	}


	public String getpRenamedFileName() {
		return pRenamedFileName;
	}


	public void setpRenamedFileName(String pRenamedFileName) {
		this.pRenamedFileName = pRenamedFileName;
	}


	@Override
	public String toString() {
		return "sbComment [bcNo=" + bcNo + ", bNo=" + bNo + ", userNo=" + userNo + ", bcContent=" + bcContent
				+ ", bcDate=" + bcDate + ", bcLevel=" + bcLevel + ", bcStatus=" + bcStatus + ", bbcNo=" + bbcNo
				+ ", nickName=" + nickName + ", pRenamedFileName=" + pRenamedFileName + "]";
	}
	   
	   

}
