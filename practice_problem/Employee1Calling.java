package com.practice_problem;

import java.util.Scanner;

public class Employee1Calling {
	public static void main(String[] args) {
		Address a = new Address();
        Scanner sc = new Scanner(System.in);
	    Employee1 e = new Employee1();
	    System.out.println("Enter Employee ID");
		e.setEmpId(sc.nextInt());
		System.out.println("Enter Employee Name");
		e.setEmpName(sc.next());
		e.setA(a);
		System.out.println("Enter City");
		a.setCity(sc.next());
		System.out.println("Enter State");
		a.setState(sc.next());
	   System.out.println(e);
		
		
	}
	

}
