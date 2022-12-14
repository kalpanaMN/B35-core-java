package org.tnsindia.enumdemo;
//we can implement interface using enum
public enum EnumCards implements CardDemo{
	//Enum constants
	HEART,CLUB,DIAMOND,SPADES;

	@Override
	public void accept() {
		System.out.println("Selected shape in the cards are: "+this);
		
	}

}
