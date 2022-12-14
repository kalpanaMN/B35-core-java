package org.tnsindia.superkeywordemo;

//parent class or super class or base class 

public class Animal {
	//variable
	protected String name="Wild-Animal";
	
	//parent constructor
	Animal()
	{
		System.out.println("Parent constructor");
	}
	
	//method
	public void accept()
	{
		System.out.println("Parent class with "+name);
	}

}
