package com.qa.junitexample;

//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;

//import static org.junit.jupiter.api.Assertions.fail; - use fail(); in method

import org.junit.jupiter.api.Test;

public class JunitExampleTest {
	//	@Test
	// @BeforeAll, @AfterAll - runs at start and end - once each, these methods must be static!
	// @BeforeEach, @AfterEach - runs before and after each @Test - always non static methods

	
	@Test
	public void test1() {
		System.out.println("Hello tester\n");

	}
	
	@Test
	public void test2() {
		System.out.println("Hello tester2\n");

	} 
	
}
