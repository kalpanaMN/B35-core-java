package org.tnsindia.polymorphismdemo;

public class MethodOverloading {
	
	//method overloading
		//1.By having the different types of arguments
		public void addition(int x,int y)
		{
			System.out.println("The addition of x and y is: "+(x+y));
			
		}
		//if return type is different and parameter is same then its overriding
		
		public void addition(float x,int y)
		{
			System.out.println("The addition of x and y is: "+(x+y));
		}


}
