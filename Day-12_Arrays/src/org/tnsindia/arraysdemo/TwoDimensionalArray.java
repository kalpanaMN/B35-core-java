package org.tnsindia.arraysdemo;
//Demo on 2D array or arrays of array
public class TwoDimensionalArray {

	public static void main(String[] args) {
		/*int [][]arr= {{11,12},{6,9},{8,81}};//[3][2]
		System.out.println(arr[0][1]);//12
		System.out.println(arr[1][1]);//9
		System.out.println(arr[2][0]);//8
		
		System.out.println("Array elements are:");
		//to print array elements
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}*/
		
		int [][]arr=new int[3][2];
		arr[0][0]=11;
		arr[0][1]=12;
		arr[1][0]=6;
		arr[1][1]=9;
		arr[2][0]=8;
		arr[2][1]=81;

		System.out.println("Array elements are:");
		//to print array elements
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
