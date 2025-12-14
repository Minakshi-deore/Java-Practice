package com.constructor;

public class Student1 {
	String name;
	int id;
	int rollno;
	String course;
	long mobileNo;
	
	Student1(){
		System.out.println("Student Information");
	}
	
	Student1(String name,int id,int rollno,String course,long mobileNo){
		this.name=name;
		this.id=id;
		this.rollno=rollno;
		this.course=course;
		this.mobileNo=mobileNo;
	}
	void studentInfo() {
		
		System.out.println("Student name:"+name);
		System.out.println("Student id:"+id);
		System.out.println("Student rollno:"+rollno);
		System.out.println("Student Course name:"+course);
		System.out.println("Student mobile number:"+mobileNo);
	}
	

}
