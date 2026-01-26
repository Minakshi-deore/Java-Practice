package com.practice_problem;

public class Student1 {
	String stdname;
	int stdId;
	Course course;
	
	Student1(){
		
	}

	public Student1(String stdname, int stdId, Course course) {
		super();
		this.stdname = stdname;
		this.stdId = stdId;
		this.course = course;
	}

	public String getStdname() {
		return stdname;
	}

	public void setStdname(String stdname) {
		this.stdname = stdname;
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public Course getC() {
		return course;
	}

	public void setC(Course course) {
		this.course = course;
	}
	


	@Override
	public String toString() {
		return "Student1 [stdname=" + stdname + ", stdId=" + stdId + ", course=" + course + "]";
	}
	

	
}