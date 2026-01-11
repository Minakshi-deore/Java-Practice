package com.break_continue;

public class D {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			//%10 gives the last digit of a number
			if(i%10==5) {
				continue;
			}
			System.out.println(i);
		}
	}

}
