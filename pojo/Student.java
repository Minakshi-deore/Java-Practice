package com.pojo;

public class Student {
	String name;
	int id;
	String city;
	long mobileNo;
	College clg;
	


   public  Student(){
    	 
     }



	 public Student(String name, int id, String city, long mobileNo,College clg) {
		super();
		this.name = name;
		this.id = id;
		this.city = city;
		this.mobileNo = mobileNo;
		this.clg=clg;
	 }



	 public String getName() {
		 return name;
	 }



	 public void setName(String name) {
		 this.name = name;
	 }



	 public int getId() {
		 return id;
	 }



	 public void setId(int id) {
		 this.id = id;
	 }



	 public String getCity() {
		 return city;
	 }



	 public void setCity(String city) {
		 this.city = city;
	 }



	 public long getMobileNo() {
		 return mobileNo;
	 }



	 public void setMobileNo(long mobileNo) {
		 this.mobileNo = mobileNo;
	 }
	 
	 public College getClg() {
		 return clg;
	 }
	 
	 public void setClg(College clg) {
		 this.clg=clg;
	 }



	 @Override
	 public String toString() {
		return "Student [name=" + name + ", id=" + id + ", city=" + city + ", mobileNo=" + mobileNo +", clg=" +clg + "]";
	 }
	 
     
     
}