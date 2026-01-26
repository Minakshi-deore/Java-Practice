package com.practice_problem;

public class Book extends LibraryAction {
	private int id;
	private String title;
	private String author;
	
	Book(){
		
	}

	public Book(int id, String title, String author) {
		
		this.id = id;
		this.title = title;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
      public void  issueBook() {
    	  System.out.println("issue book from mr Smit");
      }
	
	public void returnBook() {
		System.out.println("Return book to mr jain");
	}
	
	
	

}
