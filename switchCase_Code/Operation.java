package com.switchCase_Code;

import java.util.Scanner;

public class Operation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1");
		int num1 = sc.nextInt();
		System.out.println("Enter num2");
		int num2 = sc.nextInt();
		System.out.println("Enter Operation");
		String op = sc.next();
		switch(op) {
		case "Add":
			System.out.println("Addition"+" "+(num1+num2));
			break;
		case "Sub":
			System.out.println("Substraction"+" "+(num1-num2));
			break;
		case"Multi":
			System.out.println("Multiplication"+" "+(num1*num2));
			break;
		case"Div":
			System.out.println("Division"+" "+(num1/num2));
		default:
			System.out.println("Invalid operation");
		}
	}
	

}
