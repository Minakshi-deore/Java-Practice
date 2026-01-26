package com.practice_problem;

import java.util.Scanner;

public class StudentInfo {
	public static void main(String[] args) {
		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Id");
		s.setId(sc.nextInt());
		System.out.println("Enter Student Name");
		s.setName(sc.next());
		System.out.println("Enter Student Percentage");
		s.setPercentage(sc.nextDouble());
		System.out.println("Student ID:"+s.getId());
		System.out.println("Student Name:"+s.getName());
		System.out.println("Student Percentage:"+s.getPercentage());
	}

}
