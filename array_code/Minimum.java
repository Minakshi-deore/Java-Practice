package com.array_code;

import java.util.Scanner;

public class Minimum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Element");
		int [] marks = new int [5];
		
		for(int i=0;i<marks.length;i++) {
			marks[i]=sc.nextInt();
		}
		 int min = marks[0];
		 for(int i=0;i<marks.length;i++) {
			 if(marks[i]<min) {
				 min=marks[i];
			 }
			 
		 }
		 System.out.println("Minimum marks is:"+min);
	}

}
