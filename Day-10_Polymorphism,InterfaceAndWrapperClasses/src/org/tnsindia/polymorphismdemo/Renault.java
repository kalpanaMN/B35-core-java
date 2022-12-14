package org.tnsindia.polymorphismdemo;
//Demo on Constructor overloading
public class Renault {
	public String model;
	public String engine;
	
	//Constructor overloading
	//parameterized constructor
	Renault(String model,String engine)
	{
		System.out.println("Model name is: "+model+" "+
				"Engine is: "+engine);
	}
	//parameterized constructor
	Renault(String model)
	{
		System.out.println("Model name is: "+model);
	}

}
