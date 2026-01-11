package com.break_continue;

public class LastDigit {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if(i%10==2) {
				continue;
			}
			System.out.println(i);
		}
	}

}
