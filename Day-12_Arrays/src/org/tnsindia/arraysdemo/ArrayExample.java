package org.tnsindia.arraysdemo;
//demo on to know the class of array
public class ArrayExample {

	public static void main(String[] args) {
		//String[] arr= {"January","February","March","April","May"};//String
		//int arr[]= {12,4,6,9};//I
		float arr[]= {12.6f,4.9f,69.4f};//F
		/*getClass() Returns the runtime class of this Object*/
		/*getName() Returns the canonical name of the underlying class asdefined by The Java Language Specification.*/
		System.out.println(arr.getClass().getName());

	}

}
