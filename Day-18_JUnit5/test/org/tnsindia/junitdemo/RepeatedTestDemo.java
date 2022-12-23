package org.tnsindia.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class RepeatedTestDemo {

	@RepeatedTest(3)
	void test() {
		
		System.out.println("Welcome Dear Students");
		
	}

}
