package org.tnsindia.staticdemo;
//Demo on static variable
public class StaticKeywordDemo {
	
	//static variable
	static int a;
	float b;
	
	//static method
	public static  void accept()
	{
		System.out.println("Welcome to Java Full Stack Program");
	}
	//static block is used to initialize static data members
	static
	{
		a=45;
		//we can't use non static variable inside static block
		//b=89;
	}

}
