package com;

public class CalculatorImpl implements Calculator {
	@Override
	public void add(int a,int b)
	{
		System.out.println("Sum of "+a+" & "+b+" is "+(a+b));
	}
	@Override
	public void mul(int a,int b)
	{
		System.out.println("product  of "+a+" & "+b+" is "+a*b);
	}
}
