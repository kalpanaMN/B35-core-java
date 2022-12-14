package org.tnsindia.arraysdemo;

import java.util.Scanner;
//Driver class
public class StudentArrayExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//non-primitive array memory allocation
		Student[] arr1=new Student[3];
		System.out.println("Enter the values in the array: ");
		arr1[0]=new Student(s.nextInt(),s.nextLine());
		arr1[1]=new Student(s.nextInt(),s.nextLine());
		arr1[2]=new Student(s.nextInt(),s.nextLine());
		//to print the array elements
		System.out.println("Array elements are:");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i].getRoll_no()+","+arr1[i].getName()+" ");
		}		


	}

}
