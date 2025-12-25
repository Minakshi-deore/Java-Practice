package com.pojo;

public class Main {
	public static void main(String[] args) {
		College c = new College(1234,"RCP","Shirpur",908765432l);
		Student s = new Student("Minakshi",84,"Pune",90765432l,c);
		System.out.println(s);
	}

}
