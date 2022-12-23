package org.tnsindia.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
@TestInstance(Lifecycle.PER_CLASS)
interface LifeCycleMethodDemo {
	
	//to use all the method with interface make the method as default

	@Test
	default void test() {
		System.out.println("Simple Test Method");
	}

	@Test
	@AfterEach
	default void print()
	{
		System.out.println("AfterEach Demo Method");

	}
	@Test
	@AfterAll
	default void accept()
	{
		System.out.println("AfterAll Demo Method");

	}
	
}
