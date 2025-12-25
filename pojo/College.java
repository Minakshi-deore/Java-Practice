package com.pojo;

public class College {
	int clgId;
	String clgName;
	String clgAddress;
	long clgcontact;
	
	public College() {
		
	}
	
	
	
	@Override
	public String toString() {
		return "College [clgId=" + clgId + ", clgName=" + clgName + ", clgAddress=" + clgAddress + ", clgcontact="
				+ clgcontact + "]";
	}



	public int getClgId() {
		return clgId;
	}



	public void setClgId(int clgId) {
		this.clgId = clgId;
	}



	public String getClgName() {
		return clgName;
	}



	public void setClgName(String clgName) {
		this.clgName = clgName;
	}



	public String getClgAddress() {
		return clgAddress;
	}



	public void setClgAddress(String clgAddress) {
		this.clgAddress = clgAddress;
	}



	public long getClgcontact() {
		return clgcontact;
	}



	public void setClgcontact(long clgcontact) {
		this.clgcontact = clgcontact;
	}



	public College(int clgId, String clgName, String clgAddress, long clgcontact) {
		super();
		this.clgId = clgId;
		this.clgName = clgName;
		this.clgAddress = clgAddress;
		this.clgcontact = clgcontact;
	}
	
	

}
