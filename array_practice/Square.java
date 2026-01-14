package com.array_practice;

public class Square {
	public static void main(String[] args) {
		int []num= {8,9,6,4,6,3,2};
		System.out.println("Square of  each element");
		for(int i=0;i<num.length;i++) {
			int square=num[i]*num[i];
			System.out.println(num[i]+"="+ square);
		}
	}

}
