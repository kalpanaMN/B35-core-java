package org.tnsindia.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertionDemo {

	@Test
	void accept() {
		
		/*if both the value is not same then it will fail*/
		assertEquals(15,15);
		
	}
	
	@Test
	void print() {
		
		/*if the actual value is not null then it fails*/
		assertNull(null);
		
	}
	
	@Test
	void display() {
		//Fails if expression is not true
		assertTrue(3!=4);
		
	}

}
