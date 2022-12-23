package org.tnsindia.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class AssumptionDemo {

	@Test
	void test() {
		System.setProperty("Shiwani", "Jenny");
		
		//Execute the body when the positive condition  else test will be skipped
		Assumptions.assumeTrue("Jenny".equals(System.getProperty("Shiwani")));
	}
	
	@Test
	void display() {
		System.setProperty("Shiwani", "Jenny");
		
		//Execute the body when the negative condition  else test will be skipped
		Assumptions.assumeFalse("Rhia".equals(System.getProperty("Shiwani")));
	}
	
	@Test
	void print() {
		System.setProperty("Shiwani", "Jenny");
		
		Assumptions.assumingThat(true, null);
	}

}
