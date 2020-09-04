package com.newlecture.web.entity;

import java.sql.Date;

public class NoticeView extends Notice {

	private int cmtCount;
	
	
	
	public int getCmtCount() {
		return cmtCount;
	}
	public void setCmtCount(int cmtCount) {
		this.cmtCount = cmtCount;
	}
	public NoticeView() {
		
	}
	public NoticeView(int id, String title, Date regdate, String writerId, int hit, String files, int cmtCount) {
		super(id, title, regdate, writerId, hit, files, "");
		this.cmtCount = cmtCount;
	}

}