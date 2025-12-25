package com.pojo;

public class Library {
	String libName;
	String libAddress;
	int libId;
	String openingTime;
	String closingTime;
	long libContact;
	
	Library(){
		
	}

	public Library(String libName, String libAddress, int libId, String openingTime, String closingTime,
			long libContact) {
		super();
		this.libName = libName;
		this.libAddress = libAddress;
		this.libId = libId;
		this.openingTime = openingTime;
		this.closingTime = closingTime;
		this.libContact = libContact;
	}

	public String getLibName() {
		return libName;
	}

	public void setLibName(String libName) {
		this.libName = libName;
	}

	public String getLibAddress() {
		return libAddress;
	}

	public void setLibAddress(String libAddress) {
		this.libAddress = libAddress;
	}

	public int getLibId() {
		return libId;
	}

	public void setLibId(int libId) {
		this.libId = libId;
	}

	public String getOpeningTime() {
		return openingTime;
	}

	public void setOpeningTime(String openingTime) {
		this.openingTime = openingTime;
	}

	public String getClosingTime() {
		return closingTime;
	}

	public void setClosingTime(String closingTime) {
		this.closingTime = closingTime;
	}

	public long getLibContact() {
		return libContact;
	}

	public void setLibContact(long libContact) {
		this.libContact = libContact;
	}

	@Override
	public String toString() {
		return "Library [libName=" + libName + ", libAddress=" + libAddress + ", libId=" + libId + ", openingTime="
				+ openingTime + ", closingTime=" + closingTime + ", libContact=" + libContact + "]";
	}
	
	

}
