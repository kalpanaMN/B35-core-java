package org.tnsindia.collectiondemo;

import java.util.Comparator;
//Comparator is an functional interface which contains extacly one abstract method
public class AgeComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		int e1=((Employee)o1).getAge();
		int e2=((Employee)o2).getAge();
		if(e1>=e2)
		{
			System.out.println("Employee1 is elder");
		}
		else if(e1==e2)
		{
			System.out.println("both are same age");

		}
		else
		{
			System.out.println("Employee2 is elder");

		}
		return 0;
	}

}
