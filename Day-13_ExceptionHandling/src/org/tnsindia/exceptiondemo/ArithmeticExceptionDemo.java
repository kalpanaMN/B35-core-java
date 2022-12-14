package org.tnsindia.exceptiondemo;
//Demo on ArithmeticException
import java.util.Scanner;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=14;
		System.out.println("Enter the value of y:");
		int y=s.nextInt();
		/*try block contains the exception code*/
		try {
			
			int result=x/y;
			System.out.println(result);

		}
		/*catch block will handle the exception raised by try block*/
		catch(ArithmeticException e)
		{
			System.out.println("Exception handled "+e);
		}

	}

}
