package org.tnsindia.arraysdemo;

import java.util.Scanner;
/*Jagged array in java is array of arrays such that member arrays can be of different sizes
 i.e., we can create a 2-D arrays but with variable number of columns in each row. 
*/
public class JaggedArray {

	public static void main(String[] args) {
		//Declaring 2D array with 2 rows
		int arr[][]=new int[2][];
		//make this array as jagged array
		//first row has 2 columns
		arr[0]=new int[2];
		//second row has 1 column
		arr[1]=new int[1];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the elements of an array: ");
		//to enter the array elements
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				//1st-2col ,2nd row -1 col=3-elements
				arr[i][j]=s.nextInt();
			}
			
		}
		//to print the array elemnets
		System.out.println("Jagged array is:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
		}
	}

}
