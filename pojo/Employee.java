package com.pojo;

public class Employee {
	int empId;
	String empName;
	double empSalary;
	String city;
	long mobileNo;
	
	Employee(){
		
	}
	
	Employee(int empId,String empName,double empSalary,String city,long mobileNo){
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;
		this.city=city;
		this.mobileNo=mobileNo;
	}
	
	public int  getEmpId() {
		return empId;
	}
	
	public void setEmpId(int empId) {
		this.empId=empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void seteEmpName(String empName) {
		this.empName=empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary=empSalary;
	}
	public String getEmpCity() {
		return city;
	}
	public void setEmpCity(String city) {
		this.city=city;
	}
	public long getEmpMobileNo() {
		return mobileNo;
	}
	public void setEmpmobileNo(long mobileNo) {
		this.mobileNo=mobileNo;
	}
	 public String toString() {
		 return "Employee[empId="+empId +" ,empName=" + empName+ ",  empSalary=" +empSalary+", city="+city +",MobileNo=" +mobileNo+"]";
				 
	 }
		

}

