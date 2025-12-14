package com.Inheritance_Code;

public class Teacher extends Person {
	String subject;
	
	Teacher(String name,int id,String depart,String subject){
		super(name,id,depart);
		this.subject=subject;
	}
	void teachDetails() {
		System.out.println("Subject:"+subject);
	}
	public static void main(String[] args) {
		Student s = new Student("Minakshi",890,"CS",84);
		s.personDetails();
		s.studDetails();
		
		Teacher t = new Teacher("Ms Mansi",345,"CS","Java");
		t.personDetails();
		t.teachDetails();
	}

}
