package com.Inheritance_Code;

public class Student extends Person {
	int rollno;
	
	Student(String name ,int id,String depart,int rollno){
		super(name,id,depart);
		this.rollno=rollno;
		
	}
	void studDetails() {
		
		System.out.println(" Rollno:"+rollno);
	}

}
