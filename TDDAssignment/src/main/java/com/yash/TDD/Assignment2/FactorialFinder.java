package com.yash.TDD.Assignment2;

public class FactorialFinder {
	public static int getFactorial() {
		int fact =1;
		int number=5;
		for (int i = 1; i <= number; i++) {
			fact=fact*i;
		}
		return fact;
	}
}