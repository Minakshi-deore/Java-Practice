package com.Scanner_practise;

import java.util.Scanner;

public class StudentMarks {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks");
		float marks=sc.nextFloat();
		if(marks>=30){
			System.out.println("pass");
		}else {
			System.out.println("Fail");
		}
		
	}

}
