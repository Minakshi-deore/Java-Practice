package com.practice_problem;

import java.util.Scanner;

public class Student_main {
	public static void main(String[] args) {
	
		

		         Scanner sc = new Scanner(System.in);

		        System.out.print("Enter Student ID: ");
		        int stdId = sc.nextInt();
		        sc.nextLine();

		        System.out.print("Enter Student Name: ");
		        String stdName = sc.nextLine();

		        System.out.print("Choose Course Type (1-Degree, 2-Diploma): ");
		        int choice = sc.nextInt();
		        sc.nextLine();

		        System.out.print("Enter Course Name: ");
		        String courseName = sc.nextLine();

		        System.out.print("Enter Course Duration (months): ");
		        String course_duration = sc.next();

		        
		        Course course;
		        if (choice == 1) {
		            course = new DegreeCourse(courseName, course_duration);
		        } else {
		            course = new DiplomaCourse(courseName, course_duration);
		        }

		        Student1 s = new Student1(stdName,stdId,course);

		        System.out.println("\n--- Student & Course Summary ---");
		        System.out.println(s); 

		        sc.close();
		    }
		
}
