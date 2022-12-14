package org.tnsindia.stringdemo;

import java.util.Scanner;

public class StringMethodsDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		String str2=s.nextLine();
		//to combine the two strings
		System.out.println(str1+str2);
		System.out.println(str1.concat(str2));
		
		//to find the length of the string
		System.out.println("The length of the Str1 is: "+str1.length());

		/* if charcter that we passed is not present in the string , then we get -1*/
		System.out.println("The index of the Str1 is: "+str1.indexOf('w'));
		System.out.println("The char at the 3rd index of Str1 is: "+str1.charAt(3));//w
		System.out.println(str2.toUpperCase());
		System.out.println(str2.toLowerCase());


	}

}
