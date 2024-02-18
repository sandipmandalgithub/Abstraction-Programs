package com;

public class MainClass {
	public static void main(String[] args) {
		Tom t=new Tom();
		t.work();    //showing the method implementation
		
		Person p=t;   //Abstraction
		p.work();   //not showing the method implementation
	}

}
