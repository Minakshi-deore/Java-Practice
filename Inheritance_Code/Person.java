package com.Inheritance_Code;

public class Person {
	String name;
	int id;
	String depart;
	
	
	Person(String name,int id,String depart){
		this.name=name;
		this.id=id;
		this.depart=depart;
	}
	
	void personDetails() {
		System.out.println("Name:"+name);
		System.out.println("ID:"+id);
		System.out.println("Department:"+depart);
	}
	
	

}
