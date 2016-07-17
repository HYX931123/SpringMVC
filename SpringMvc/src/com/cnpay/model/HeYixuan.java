package com.cnpay.model;

import java.io.Serializable;
import java.util.Date;

public class HeYixuan implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String title;
	private String contents;
	private String createUser;
	private Date pushTime;
	private Date createTime;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public Date getPushTime() {
		return pushTime;
	}
	public void setPushTime(Date pushTime) {
		this.pushTime = pushTime;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public HeYixuan(Integer id, String title, String contents,
			String createUser, Date pushTime, Date createTime) {
		super();
		this.id = id;
		this.title = title;
		this.contents = contents;
		this.createUser = createUser;
		this.pushTime = pushTime;
		this.createTime = createTime;
	}
	public HeYixuan() {
		super();
	}
	
	@Override
	public String toString() {
		return "HeYixuan [id=" + id + ", title=" + title + ", contents="
				+ contents + ", createUser=" + createUser + ", pushTime="
				+ pushTime + ", createTime=" + createTime + "]";
	}
	
	
	
	

}
