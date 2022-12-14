package org.tnsindia.interfacedemo;

/*//Implementable class
//interface only implements the classes
public class Employee implements Manager {

	@Override
	public void salaryDiscussion() {
		System.out.println("About Basic and variable pay");
		
	}

	@Override
	public void projectDiscussion() {
		System.out.println("About the Java projects");

	}

}*/
//Multiple Inheritance using interface
//child class is implementing the multiple parent interface
public class Employee implements HR,Manager
{

	@Override
	public void projectDiscussion() {
		System.out.println("About the Java projects");		
	}

	@Override
	public void salaryDiscussion() {
		System.out.println("About Basic and variable pay");
		
	}
	
}