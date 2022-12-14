package org.tnsindia.exceptiondemo;
//Demo on ArrayIndexOfBoundException
public class ArrayIndexOfBoundExceptionDemo {

	public static void main(String[] args) {
		System.out.println("First line");
        System.out.println("Second line");
    	int[] myIntArray = new int[]{1, 2, 3};

        try {
        	print(myIntArray);
        }

        
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception Handled"+e);

        }
        /*if any statement is ouside the try-catch block that is always executed*/
        //System.out.println("Outside try-catch block");
        //Finally block is followed by the catch block
        //Finally block is always executed whether any exception occurred or not*/
        finally
        {
        	System.out.println("Finally block is always executed");
        }
        System.out.println("Outside try-catch block-11");

    } 
    public static void print(int[] arr) {
        System.out.println(arr[3]);
        System.out.println("Fourth element successfully displayed!");
    }

	

}

        

