package org.tnsindia.collectiondemo;

import java.util.HashSet;
import java.util.Set;
//Demo on Set Interface
//- to implement the set use HashSet/LinkedHashSet
public class HashSetDemo {

	public static void main(String[] args) {
		
		//Set is an unordered so when it prints the element it will print in any order
		Set<Integer>obj=new HashSet<>();
		obj.add(12);
		obj.add(95);
		obj.add(64);
		obj.add(52);
		obj.add(22);
		System.out.println(obj);
		//to extract the elements from set
		for(Integer itr:obj)
		{
			System.out.print(itr+" ");
		}

		
	}

}
