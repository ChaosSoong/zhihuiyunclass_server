package com.hdky.model;

public class Teacher {
	private String tid;
	private String tpassword;
	private String tname;
	private String classse;
	private String tsex;
	private String tage;
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getTpassword() {
		return tpassword;
	}
	public void setTpassword(String tpassword) {
		this.tpassword = tpassword;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getClassse() {
		return classse;
	}
	public void setClassse(String classse) {
		this.classse = classse;
	}
	public String getTsex() {
		return tsex;
	}
	public void setTsex(String tsex) {
		this.tsex = tsex;
	}
	public String getTage() {
		return tage;
	}
	public void setTage(String tage) {
		this.tage = tage;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(String tid, String tname) {
		super();
		this.tid = tid;
		this.tname = tname;
	}
	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tname=" + tname + ", classse="
				+ classse + ", tsex=" + tsex + "]";
	}
	
	

}
