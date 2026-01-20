package com.array_code;

import java.util.Scanner;

public class Maximum_num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers you want to print");
		int n = sc.nextInt();
		int[] num = new int[n];

		System.out.println("Enter Array element");
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
		}
		int max=num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]>max) {
			max=num[i];
		}
	}
			System.out.println("maximum number is:"+max);
		
	}
}

