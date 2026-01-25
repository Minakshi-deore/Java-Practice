package com.oop;

public class Book {
	String title;
	String author;
	int price;
	
	Book(String title,String author,int price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
		public void details() {
			System.out.println("Book Title:"+title);
			System.out.println("Book Author:"+author);
			System.out.println("Book Price:"+price);
		}
		
	}


