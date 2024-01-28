package com.xmlautowire.entity;

import java.util.List;

public class Subject {

	private String sub1;
	private String sub2;
	private String sub3;
	
	
	
	public Subject(String sub1, String sub2, String sub3) {
		super();
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	
	
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getSub1() {
		return sub1;
	}
	public void setSub1(String sub1) {
		this.sub1 = sub1;
	}
	public String getSub2() {
		return sub2;
	}
	public void setSub2(String sub2) {
		this.sub2 = sub2;
	}
	public String getSub3() {
		return sub3;
	}
	public void setSub3(String sub3) {
		this.sub3 = sub3;
	}
	@Override
	public String toString() {
		return "Subject [sub1=" + sub1 + ", sub2=" + sub2 + ", sub3=" + sub3 + "]";
	}
	
	
//	private List<String> subjects;
//
//	public List<String> getSubjects() {
//		return subjects;
//	}
//
//	public void setSubjects(List<String> subjects) {
//		this.subjects = subjects;
//	}
//
//	@Override
//	public String toString() {
//		return "Subject [subjects=" + subjects + "]";
//	}

	
}
