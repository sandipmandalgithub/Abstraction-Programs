package com;

public class BankImple implements Bank,Atm
{
	int balance=40;
	@Override
	public void deposit(int amount)
	{
		System.out.println("Deposit Rs."+amount);
		balance +=amount;
		System.out.println("Deposit successfully");

	}
	@Override
	public void withdraw(int amount)
	{
		if(amount<=balance)
		{

			System.out.println("Withdrawing ammount :"+amount);
			balance -=amount;
			System.out.println("Balance withdrawn successfully");

		}
		else
			System.out.println("insufficent Balance");
	}
	@Override
	public void checkBalance()
	{
		System.out.println("Avalable  Balance is:"+balance);
	}
	
//	public void withdraw(double amount) {
//		
//		
//	}


}
