package org.tnsindia.collectiondemo;

import java.util.Stack;
import java.util.Vector;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String>obj=new Stack<>();
		//insertion
		obj.push("Shiwani");
		obj.push("Pooja");
		obj.push("Yogesh");
		obj.push("Rajesh");
		System.out.println(obj);
		//remove-LIFO
		obj.pop();
		System.out.println(obj);


	}

}
