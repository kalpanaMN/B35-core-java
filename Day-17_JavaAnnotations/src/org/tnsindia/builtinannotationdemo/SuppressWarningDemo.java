package org.tnsindia.builtinannotationdemo;

import java.util.ArrayList;

public class SuppressWarningDemo {

	//used to solve the compile time warning
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList obj=new ArrayList<>();
		obj.add(12);
		obj.add("Shiwani");
		obj.add(13.5);
		System.out.println(obj);
		
	}

}
