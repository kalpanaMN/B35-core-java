package org.tnsindia.exceptiondemo;

import java.io.IOException;
import java.util.Scanner;

public class ThrowsKeywordDemo {
	
	public static void print(int x) throws IOException 
	{
		if(x==1)
		{
			System.out.println("it is equal");
		}
		else
			throw new IOException("IOException Occurred");
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the input for x:");
		int x=s.nextInt();
		try
		{
			print(x);
		}
		
		catch(Exception  e)
		{
			System.out.println(e);
		}

	}

}
