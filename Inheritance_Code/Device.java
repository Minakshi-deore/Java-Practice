package com.Inheritance_Code;

public class Device {
	String brand;
    String model;
    String deviceType;   
    String serialNumber;
    double price;
    
    Device(String brand,String model,String deviceType,String serialNumber,
    double price ){
    	this.brand=brand;
    	this.model=model;
    	this.deviceType=deviceType;
    	this.serialNumber=serialNumber;
    	this.price=price;
    	
    }
    void deviceDetails() {
    	System.out.println("brand name:"+brand);
    	System.out.println("model name:"+model);
    	System.out.println("device type:"+deviceType);
    	System.out.println("Serial number:"+serialNumber);
    	System.out.println("Price:"+price);
    }
    
    

}
