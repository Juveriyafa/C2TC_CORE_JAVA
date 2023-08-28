package com.tnsif.inheritance;

public class Citizen
//base class
{
	private String name;
	private String aadharno;
	private String address;
	private long phoneno;
	
	
	
	
	public Citizen() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Citizen(String name, String aadharno, String address, long phoneno) {
		super( );
		this.name = name;
		this.aadharno = aadharno;
		this.address = address;
		this.phoneno = phoneno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAadharno() {
		return aadharno;
	}


	public void setAadharno(String aadharno) {
		this.aadharno = aadharno;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public long getPhoneno() {
		return phoneno;
	}


	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}


	@Override
	public String toString() {
		return "Citizen [name=" + name + ", aadharno=" + aadharno + ", address=" + address + ", phoneno=" + phoneno
				+ "]";
	}
	
	

}
