package org.tnsindia.collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Character>obj=new LinkedList<Character>();
		obj.add('N');//0
		obj.add('S');//1st index
		obj.add('K');//2nd
		obj.add('S');//3rd index
		obj.add('O');
		obj.addFirst('M');
		obj.addLast('X');
		List<Character>obj1=new LinkedList<>();
		System.out.println(obj1.isEmpty());
		System.out.println(obj.isEmpty());
		System.out.println(obj.contains('O'));
		


		System.out.println("The Collection elements are: "+obj);
		//size of the list
		System.out.println("The total  elements are: "+obj.size());
		System.out.println("The index of given element are: "+obj.indexOf('S'));
		System.out.println("The last index is: "+obj.lastIndexOf('S'));
		
		System.out.println("The Collection elements are: "+obj.get(2));
		//ascending order
		Collections.sort(obj);
		System.out.println("The Collection elements are: "+obj);
		//descending order
		Collections.reverse(obj);
		System.out.println("The Collection elements are: "+obj);

	}

}
