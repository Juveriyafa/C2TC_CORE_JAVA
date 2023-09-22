package com.tnsif.interfacedemo;

public class BankImpl implements  Bank{

	@Override
	public void deposit(Account account, double amount) {
		// TODO Auto-generated method stub
		
		if(amount>DEPOSIT_LIMIT)
			System.err.println("Deposit not possible....Limit exceeded");
		else
			account.setBalance(+account.getBalance()+amount);
			System.out.println("Money Deposited");
		
	}

	@Override
	public void withdraw(Account account, double amount) {
		// TODO Auto-generated method stub
		
		
		if(account.getBalance()-amount>=MIN_BALANCE)
		{
			account.setBalance(account.getBalance()-amount);
			System.out.println("Money Withdrawn" +amount+ "from account:" +account.getAccno());
			
		}
		else
		{
			System.err.println("Insufficient Balance"  +account.getAccno());
		}
		
	}

}
