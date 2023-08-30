package com.tnsif.MultiLevelInheritace;


public class MultiulevelInDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Country c;
		   c=new Country("India",1428627663);
		   
		   /*The java instanceof operator is used to test 
		   whether the object is an instance of the specified type (class or subclass or interface).*/
		   
		  if (c instanceof Country)
			  System.out.println("Country ="+c);
		  
		  
		  
		  c=new State("India",1428627663,"Delhi","Hindi");
		  
		  if (c instanceof Country)
		  System.out.println("State="+c);
		  
		  
		c=new City("India",1428627663,"Delhi","Hindi","Adithya Thappar","Taj Mahal");
		  
		  if (c instanceof Country)
		  System.out.println("City="+c);


	}

}
