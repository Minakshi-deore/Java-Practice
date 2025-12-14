package com.constructor;

public class Employee {
	String empName;
	int empId;
	double empSalary;
	long empMobileNo;
	
	
	Employee(String empName, int empId, int empSalary, long empMobileNo){
		this.empName=empName;
		this.empId=empId;
		this.empSalary=empSalary;
		this.empMobileNo=empMobileNo;
		
		
	}
	
	Employee(){
		System.err.println("Employee Details");
	}
	void employeeInfo() {
		System.out.println("Employee name:"+empName);
		System.out.println("Employee id:"+empId);
		System.out.println("Employee Salary:"+empSalary);
		System.out.println("Emplouyee mobile number:"+empMobileNo);
	}

}
