package org.tnsindia.exceptiondemo;

import java.util.Scanner;
//Demo on when finally block is not executed
public class FinallyBlockNotExecutedDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=12;

		try {
			int y=s.nextInt();
			System.out.println("Inside try-catch"+x/y);
			/*1.when you called below line and your try block does not contain
			any exception,then finally block is not executed*/
			System.exit(0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception handled "+e);
		}
		/*finally
		{
			System.out.println("Finally Block");
		}*/
		/*2.when finally block contains the exception, the finally block is not executed*/
		finally
		{
			int res=13/0;
			System.out.println(res);
		}
		

	}

}
