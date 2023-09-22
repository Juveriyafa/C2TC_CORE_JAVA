package com.tnsif.interfacedemo;

public class ExecutorInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank bank=new BankImpl();
		Account account=new Account(123456,"Afra",5,bank);
		
		account.deposit(2000);
		System.out.println(account);
		
		account.withdraw(1000);
		System.out.println(account);

	}

}
