package com.yash.TDD.Assignment4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringAdditionTest {

	StringAddition stringAddition=new StringAddition();
	
	@Test
	public void stringAdditionTest() {
		assertEquals("9", stringAddition.additionString("2+3+4"));
		
	}
}
