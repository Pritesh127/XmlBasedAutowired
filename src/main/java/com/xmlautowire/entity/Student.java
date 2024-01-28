package com.xmlautowire.entity;



public class Student {

	private String name;
	private String marks;
	
	private Subject stuSubjects;
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMarks() {
		return marks;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}
	public Subject getStuSubjects() {
		return stuSubjects;
	}
	public void setStuSubjects(Subject stuSubjects) {
		this.stuSubjects = stuSubjects;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + ", stuSubjects=" + stuSubjects + "]";
	}
	
	
	
	
}
