package com.condition_state;

import java.util.Scanner;

public class Leap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year");
		int year = sc.nextInt();
		
	    if(year % 4 ==0 || year % 400 == 0 || year % 100 == 0) {
	    	System.out.println("Leap year");
	    	if( year % 100 == 0) {
	    		System.out.println("Century year");
	    	}else {
	    		System.out.println("Not a Century year");
	    	}
	    }else {
	    	System.out.println("Not a leap year");
	    }
	}

}
