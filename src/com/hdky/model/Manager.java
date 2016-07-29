package com.hdky.model;

public class Manager {
	 private String mid;
	 private String mpassword;
	 private String mname;
	 private String msex;
	 private String mage;
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getMpassword() {
		return mpassword;
	}
	public void setMpassword(String mpassword) {
		this.mpassword = mpassword;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMsex() {
		return msex;
	}
	public void setMsex(String msex) {
		this.msex = msex;
	}
	public String getMage() {
		return mage;
	}
	public void setMage(String mage) {
		this.mage = mage;
	}
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Manager(String mid, String mname) {
		super();
		this.mid = mid;
		this.mname = mname;
	}
	 
	 

}
