package com.yash.TDD.Assignment3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestOddEven {

	OddEvenCount oddEvenCount=new OddEvenCount();
	
	@Test
	public void evenNumberTest() {
		assertEquals(3, oddEvenCount.evenCount(23456));
	}
	@Test
	public void oddNumberTest() {
		assertEquals(2, oddEvenCount.oddCount(23456));
	}
}
