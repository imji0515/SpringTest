package com.board.domain;

import java.util.Date;

public class BoardVO {
//	 create table tbl_board(
//			  bno int not null auto_increment,
//			  title varchar(50) not null,
//			  content text not null,
//			  writer varchar(30) not null,
//			  regDate timestamp default now(),
//			  viewCnt int default 0,
//			  primary key(bno)
//			 );
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date regDate;
	public int getBno() {
		return bno;
	}
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public String getWriter() {
		return writer;
	}
	public Date getRegDate() {
		return regDate;
	}
	public int getViewCnt() {
		return viewCnt;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}
	private int viewCnt;
	
	
}
