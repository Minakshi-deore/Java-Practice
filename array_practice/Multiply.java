package com.array_practice;

public class Multiply {
	public static void main(String[] args) {
		int [] num = {2,6,7,8,9};
		int square=1;
		for(int i=0;i<num.length;i++) {
			square=square*num[i];
			
		}
		System.out.println(square);
	}

}
