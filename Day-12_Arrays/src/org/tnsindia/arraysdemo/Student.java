package org.tnsindia.arraysdemo;

public class Student {
	
	//private data members
	private int roll_no;
	private String name;
	
	//constructor
	public Student(int roll_no, String name) {
		super();
		this.roll_no = roll_no;
		this.name = name;
	}

	//getters and setters method
	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
