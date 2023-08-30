package com.tnsif.heiraricalinheritance;

public class Employee extends Person {
private int emp_id;
private float salary;
private String dept;
public Employee(String name, String city,int emp_id, float salary, String dept) {
	super(name,city);
	this.emp_id = emp_id;
	this.salary = salary;
	this.dept = dept;
}
public int getEmp_id() {
	return emp_id;
}
public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
@Override
public String toString() {
	return "Employee [emp_id=" + emp_id + ", salary=" + salary + ", dept=" + dept + ",Name()="+getName()+",City()="+getCity()+"]";
}


}
