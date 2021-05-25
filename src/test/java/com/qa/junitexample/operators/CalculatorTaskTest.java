package com.qa.junitexample.operators;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.qa.junitexample.CalculatorTask;

public class CalculatorTaskTest {

	@Test
	public void addTest() {
		double result = CalculatorTask.add(12, 3);
		
		assertEquals(15, result);
	}
	
	@Test
	public void subTest() {
		double result = CalculatorTask.sub(12, 2);
		
		assertEquals(10, result);
	}
	
	@Test
	public void multiTest() {
		double result = CalculatorTask.multi(12, 2);
		
		assertEquals(24, result);
	}
	
	@Test
	public void diviTest() {
		double result = CalculatorTask.divi(12, 2);
		
		assertEquals(6, result);
	}
	
	@Test
	public void modTest() {
		double result = CalculatorTask.mod(7, 5);
		
		assertEquals(2, result);
	}
}
