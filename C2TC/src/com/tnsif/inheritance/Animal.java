package com.tnsif.inheritance;

public class Animal {

private	String name;


    public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

	public void eat() {
        System.out.println("Animal is eating.");
    }

    public void sleep() {
        System.out.println("Animal is sleeping.");
    }

}
