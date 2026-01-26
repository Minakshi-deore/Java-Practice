package com.practice_problem;

public class StudentUser extends User {
	
	String Department;
	
	
	StudentUser(String Department){
		super("Minakshi",1234,123456);
		this.Department=Department;
	}


	@Override
	public void showDetails() {
		
		super.showDetails();
		System.out.println("Student Department:"+Department);
	}
	
	
	

}
