package org.tnsindia.abstractdemo;
//driver class
public class ATMMachineExecutor {

	public static void main(String[] args) {
		ATMMachine a=new ATMMachineChild();
		//ATMMachineChild a=new ATMMachineChild();
		a.withdraw();
		a.display();

	}

}
