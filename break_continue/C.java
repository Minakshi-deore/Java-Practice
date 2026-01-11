package com.break_continue;

public class C {
	public static void main(String[] args) {
		for(int i=1;i<=50;i++) {
			if(i%7==0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
