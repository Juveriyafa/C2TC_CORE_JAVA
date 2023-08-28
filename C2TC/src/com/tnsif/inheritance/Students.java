package com.tnsif.inheritance;

public class Students extends Citizen {
	private int roll_no;
	private String College_name;
	
	
	
	
	
	public Students(String name, String aadharno, String address, long phoneno) {
		super();
		// TODO Auto-generated constructor stub
	}
	public Students(String name, String aadharno, String address, long phoneno , int roll_no, String college_name) {
		super(name, aadharno,address,phoneno);
		this.roll_no = roll_no;
		College_name = college_name;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getCollege_name() {
		return College_name;
	}
	public void setCollege_name(String college_name) {
		College_name = college_name;
	}
	@Override
	public String toString() {
		return "Students [roll_no=" + roll_no + ", College_name=" + College_name + " ,name="+getName()+",aadharno="+getAadharno()+",address="+getAddress()+",phoneno="+getPhoneno()+"]";
	}
	

}
