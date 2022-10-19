package com.yash.TDD.Assignment1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestConsecutiveNumbersAddition {
	
	@Test
	public void consecutiveNumbersAdditionTest() {
		ConsecutiveNumbersAddition c = new ConsecutiveNumbersAddition(); 
		assertEquals(55, c.add());
	}
}