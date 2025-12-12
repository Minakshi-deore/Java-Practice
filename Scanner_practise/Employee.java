package com.Scanner_practise;

import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee name:");
		String name=sc.next();
		System.out.println("Enter employee id");
		int id=sc.nextInt();
		System.out.println("Enter employee salary");
		String salary=sc.next();
		System.out.println("Employee Details");
		System.out.println("Employee name:"+name);
		System.out.println("Employee id:"+id);
		System.out.println("Employee salary:"+salary);
	}

}
