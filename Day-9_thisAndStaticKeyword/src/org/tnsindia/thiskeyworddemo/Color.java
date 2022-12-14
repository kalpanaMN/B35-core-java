package org.tnsindia.thiskeyworddemo;
//5.to invoke current class constructor
public class Color {
	
	public String name;
	
	//default constructor
	Color()
	{
		this("RED");//invoking paramterized constructor
		System.out.println("Default Constructor");
	}
	//paramterized constructor
	Color(String name)
	{
		System.out.println("The color is: "+name);
	}

}
