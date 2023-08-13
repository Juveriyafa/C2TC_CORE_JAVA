package com.daythree.practice;

public class Person {
	
	private String name;
	private int age;
	private int salary;
	private int Taxes;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getTaxes() {
		return Taxes;
	}
	public void setTaxes(int taxes) {
		Taxes = taxes;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", salary=" + salary + ", Taxes=" + Taxes + "]";
	}
	
	
	

}
