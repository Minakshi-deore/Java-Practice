package com.condition_state;

import java.util.Scanner;

public class Vote {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age =sc.nextInt();
		if( age >= 18) {
			System.out.println("Voted");
		   if( age >=25) {
			System.out.println("contest election");
		   }else {
			System.out.println("Not eligible to contest in election");
		   }
	}else {
			 System.out.println("Not voted");  
		   }
		sc.close();	
		}
	}


