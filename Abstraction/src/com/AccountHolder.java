package com;
import java.util.Scanner;
public class AccountHolder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		Bank b=new BankImple(); //up casting

		while(true)
		{
			System.out.println("+++++++++++++++++++");
			System.out.println(" check Balance press   1");
			System.out.println(" Deposit Amount press  2");
			System.out.println(" Withdraw Amount press 3");
			System.out.println(" Cancle press          4");
			System.out.println("+++++++++++++++++++");
			System.out.println("Enter your choice");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				b.checkBalance();   //method binding during run time
				break;
			case 2:
				System.out.println("Enter some amount to deposit");
				int da=sc.nextInt();
				b.deposit(da);     //method binding during run time
				break;
			case 3:
				System.out.println("Enter some amount to withdraw");
				int wa=sc.nextInt();
				b.deposit(wa);     //method binding during run time
				break;
			case 4:
				System.out.println("Exit");
				return;

			default:System.out.println("Wrong Choice");			
			}
		}



	}

}
