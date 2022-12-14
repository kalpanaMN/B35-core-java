package org.tnsindia.collectiondemo;

import java.util.Arrays;
//driver class
public class ComparatorDemo {

	public static void main(String[] args) {
		Employee emp[]=new Employee[2];
		
		emp[0]=new Employee();
		emp[0].setAge(32);
		emp[0].setName("Bhuvneshwari");
		
		
		emp[1]=new Employee();
		emp[1].setAge(22);
		emp[1].setName("Pooja");
		
		//sorting the age
		Arrays.sort(emp,new AgeComparator());
		for(int i=0;i<emp.length;i++)
		{
			System.out.println("Employee "+(i+1)+"Name: "+emp[i].getName());
		}

	}

}
