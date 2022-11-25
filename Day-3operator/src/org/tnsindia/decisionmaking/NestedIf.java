package org.tnsindia.decisionmaking;
import java.util.Scanner;

public class NestedIf {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the numbers");
		int age=s.nextInt();
		int weight=s.nextInt();
		/* 1. age>=12
		 * 2. 120<weight>=40 
		 */
		if(age>=12)
		{
			if(weight>=40 && weight<=120)
			{
				if(weight >120) 
				{
					System.out.println(" extra ropes will be added");
			    }
				System.out.println("");
			
		    }
	    }
		s.close();

	}
}


