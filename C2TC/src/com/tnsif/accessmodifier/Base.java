package com.tnsif.accessmodifier;

public class Base 
{
	//variables or attributes or properties
	int varDefault=10;
	public int varPublic=20;
	private int varPrivate=30;
	protected int varProtected=40;
	
	// methods or behavior
void methodDefault()
{
	System.out.println("Default access base class"); System.out.println(varDefault);
}
 public void methodPublic()
{
	System.out.println("Default access base class"); System.out.println(varPublic);
}
private void methodPrivate()
{
	System.out.println("Default access base class"); System.out.println(varPrivate);
}
protected void methodProtected()
{
	System.out.println("Default access base class"); System.out.println(varProtected);
}
}
