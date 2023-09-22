package com.tnsif.comparable;

import java.util.ArrayList;
import java.util.Collections;

//for sorting objects

class Emp implements Comparable <Emp>
{
	
	
	int Empid;
	String Ename;
	double Sal; //sorting parameter
	static int i;
	

	public Emp() {
		Empid=i++;
		Ename="Unknown";
		Sal=0.0;
		// TODO Auto-generated constructor stub
	}

	public Emp(int empid, String ename, double sal) {
		
		Empid = empid;
		Ename = ename;
		Sal = sal;
	}

	@Override
	public int compareTo(Emp o) {
		if(this.Sal==((Emp)o).Sal)
			return 0;
		else if(this.Sal>((Emp)o).Sal)
			return 1;
		else 
			return -1;
			
	}

	@Override
	public String toString() {
		return "Emp [Empid=" + Empid + ", Ename=" + Ename + ", sal=" + Sal + "]";
	}
	
	
}

public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ArrayList<Emp>  emps=new ArrayList<Emp>();
	emps.add(new Emp(1,"Harry",254000.0));
	emps.add(new Emp(2,"Larry",4000.0));
	emps.add(new Emp(3,"Marry",10000.0));
	emps.add(new Emp(4,"Karry",14000.0));
	
	//Before Sorting
	
	System.out.println(emps);
	Collections.sort(emps);
	
	//After Sorting
	System.out.println(emps);
	
	
	
 
	}

}
