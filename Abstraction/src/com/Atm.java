package com;

interface Atm {
	default void withdraw(int amount)
	{
		System.out.println("default");
	}

}
