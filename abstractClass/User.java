package com.abstractClass;

public class User extends Login{
	
	
	
	void myAuthenticate(String username, String password) {

		if (username == "om@gmail.com" && password == "Om@123") {
			System.out.println("User Login Successfully ");
		} else {
			System.out.println("Invalid Credentials ... ! ");
		}

	}

}