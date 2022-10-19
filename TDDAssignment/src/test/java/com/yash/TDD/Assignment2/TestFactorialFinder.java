package com.yash.TDD.Assignment2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestFactorialFinder {
	@Test
	public void consecutiveNumbersAdditionTest() {
		FactorialFinder c = new FactorialFinder();
		assertEquals(120, c.getFactorial());
	}
}