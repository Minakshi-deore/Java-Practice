package com.oop;

import java.util.Scanner;

public class BookCalling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Book Title");
		String title= sc.nextLine();
		System.out.println("Enter Author name");
		String author =sc.nextLine();
		System.out.println("Enter Price");
		int price=sc.nextInt();
		Book b = new Book(title,author,price);
			b.details();
		}
	}


