package com.pojo;

public class Hospital {
	
	Patient p;
	Doctor d;
	Room r;
	
	Hospital(){
		
	}

	public Hospital(Patient p,Doctor d,Room r) {
		super();
		this.p = p;
		this.d = d;
		this.r = r;
	}



	public Patient getP() {
		return p;
	}

	public void setP(Patient p) {
		this.p = p;
	}

	public Doctor getD() {
		return d;
	}

	public void setD(Doctor d) {
		this.d = d;
	}

	public Room getM() {
		return r;
	}

	public void setM(Room r) {
		this.r = r;
	}

	@Override
	public String toString() {
		return "Hospital [ p=" + p + ", d=" + d + ", r=" + r + "]";
	}

}
