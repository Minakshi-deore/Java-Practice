package com.practice_problem;

public class Employee1 {
	int empId;
	String empName;
	Address a;
	
	Employee1(){
		
	}

	public Employee1(int empId, String empName, Address a) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.a = a;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Address getA() {
		return a;
	}

	public void setA(Address a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "Employee1 [empId=" + empId + ", empName=" + empName + ", a=" + a + "]";
	}

	
	
	}
		
	