package com.practice_problem;



public class User implements Display {
	String userName;
	int userId;
	int userPassword;
	
	public User(String userName,int userId,int userPassword){
		this.userName=userName;
		this.userId=userId;
		this.userPassword=userPassword;
	}
	
	
	
	
	public void showDetails() {
		System.out.println("Book id:"+userId);
		System.out.println("User Name:"+userName);
		System.out.println("User Id:"+userId);
		System.out.println("User Password:"+userPassword);
		
	}
	

}
