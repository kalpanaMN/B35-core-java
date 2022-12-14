package org.tnsindia.interfacedemo;

//Functional interface is a interface which contains exactly one abstract method
@FunctionalInterface
//above annotation ensures that it contains not more than one abstract method
public interface FunctionalInterfaceDemo {
	
	//abstract method
	void print(String msg);
	

}
