package com;

import java.util.Scanner;

public class MainCalculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.close();
		Calculator c=new CalculatorImpl();
		c.add(a, b);
		c.mul(a, b);
	}

}
