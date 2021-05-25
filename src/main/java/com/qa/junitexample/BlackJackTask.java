package com.qa.junitexample;

public class BlackJackTask {
//	Given 2 integer values greater than 0, return whichever is closest to 21 without going over 21. If they both go over 21 then return 0.
	
	public static int cards(int dealer, int player) {
		if (dealer > 21 && player > 21) {
            return 0;
        } else if (dealer > 21) {
            return player;
        } else if (player > 21) {
            return dealer;
        }
        return Math.max(dealer, player);
	}

}
