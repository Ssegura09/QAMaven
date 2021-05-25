package com.qa.junitexample.blackjack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.qa.junitexample.BlackJackTask;

public class BlackJackTaskTest {

	
	@Test
	public void playSuccess1() {
		int result = BlackJackTask.cards(22, 22);
		
		assertEquals(0, result);
	}
	
	@Test
	public void playSuccessPlayerWinCondition1() {
		int result = BlackJackTask.cards(22, 3);
		
		assertEquals(3, result);
	}
	
	@Test
	public void playSuccessDealer() {
		int result = BlackJackTask.cards(3, 22);
		
		assertEquals(3, result);
	}
	
	@Test
	public void playSuccessPlayerWinCondition2() {
		int result = BlackJackTask.cards(18, 19);
		
		assertEquals(19, result);
	}
}
