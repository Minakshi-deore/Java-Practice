package com.practice_problem;

public abstract class Course {
	String courseName;
	String course_duration;
	
	
	
	public Course() {
		
	}
	public Course(String courseName, String course_duration) {
		super();
		this.courseName = courseName;
		this.course_duration = course_duration;
	}
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourse_duration() {
		return course_duration;
	}
	public void setCourse_duration(String course_duration) {
		this.course_duration = course_duration;
	}
	
	public abstract void fees(double a) ;
	
	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", course_duration=" + course_duration  + "]";
	}
		
	

	
	

}
