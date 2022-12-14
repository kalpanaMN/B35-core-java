package org.tnsindia.streamapidemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterDemo {

	public static void main(String[] args) {
		List<Integer>obj1=Arrays.asList(new Integer[]{22,45,6,55,22,12});
		//List<Integer>obj2=new ArrayList<>();

		/*for(Integer itr:obj1)
		{
			if(itr%2==0)
			{
				obj2.add(itr);
			}
		}
		System.out.print(itr);*/
		obj1.stream().filter(x->x%2==0).forEach((x)->System.out.print(x+" "));
		System.out.println();

		obj1.stream().distinct().forEach((x)->System.out.print(x+" "));
		System.out.println();
		obj1.stream().limit(3).forEach((x)->System.out.print(x+" "));
		System.out.println();
		obj1.stream().skip(3).forEach((x)->System.out.print(x+" "));
	}

}
