package org.tnsindia.instanceofdemo;
//abstract class
abstract class Animal
{
	abstract void accept();
}
//implementable child class for the abstract class
class Lion extends Animal
{

	@Override
	void accept() {
		System.out.println("Lion Roars");
	}
	
}
//driver class
public class InstanceOfDemo {

	public static void main(String[] args) {
		//Animal l=new Lion();
		Lion l=new Lion();
		l.accept();
		//instanceof operator
		System.out.println(l instanceof Lion);
		System.out.println(l instanceof Animal);

	}

}
