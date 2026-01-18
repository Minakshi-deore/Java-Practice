package com.method_Overloading;

public class Student {
	int id;
	String name;
	
	Student(){
		
		System.out.println("Student id :"+id);
		System.out.println("Student name:"+name);
		
	}
	Student(int id){
		System.out.println("ID:"+id);
	}
	Student(int id,String name){
		this.id=id;
		this.name=name;
		
		System.out.println("Student id and name:"+id+" "+name );
}
	}
