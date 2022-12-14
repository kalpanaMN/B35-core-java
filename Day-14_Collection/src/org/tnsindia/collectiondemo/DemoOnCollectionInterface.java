package org.tnsindia.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;
//demo on collection interface
public class DemoOnCollectionInterface {

	//@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//Collection is an interface we can't instantiate it
		//@SuppressWarnings("rawtypes")
		Collection<Object> obj=new ArrayList<>();
		obj.add("FullStack");
		obj.add(121);
		obj.add('z');
		obj.add(13.6f);
		System.out.println("The Collection elements are: "+obj);
		//to extract the elements from arraylist
		for(Object itr:obj)
		{
			System.out.print(itr+",");
		}

	}

}
