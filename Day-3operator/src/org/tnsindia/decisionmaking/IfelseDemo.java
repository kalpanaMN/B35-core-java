package org.tnsindia.decisionmaking;
import java.util.Scanner;

public class IfelseDemo {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		if(a>b)
		{
			System.out.println("a is greater:"+a);
		}
	    else
		{
	    	System.out.println("b is greater:"+b);
		}
		s.close();
	}

}
