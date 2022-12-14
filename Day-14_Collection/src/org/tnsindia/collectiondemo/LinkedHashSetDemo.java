package org.tnsindia.collectiondemo;

import java.util.LinkedHashSet;
//Demo on LinkedHash Set
/*HashSet is an unordered but LinkedHashSet is an ordered*/
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String>obj=new LinkedHashSet<String>();
		obj.add("Meena");
		obj.add("Usha");
		obj.add("Sushma");
		obj.add("Rama");

		System.out.println(obj);
		//to extract the elements from set
		for(String itr:obj)
		{
			System.out.print(itr+" ");
		}



	}

}
