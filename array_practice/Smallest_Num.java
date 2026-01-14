package com.array_practice;

import java.util.Scanner;

public class Smallest_Num {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Array Element");
		int []num=new int[5];
		
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
		}
		int min=num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]<min) {
				min=num[i];
			}
		}
		System.out.println("Minimun number is:"+min);
	}

}
