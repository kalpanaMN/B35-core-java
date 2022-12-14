package org.tnsindia.abstractdemo;

public class Employee extends Person {

	private int ID;
	public Employee(String name, String gender,int id) {
		super(name, gender);
		ID=id;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void work() {

		if(ID>0)
		{
			System.out.println("Employee Exist");
		}
		else
		{
			System.out.println("Not Exist");
		}
	}

}
