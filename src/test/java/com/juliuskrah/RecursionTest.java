package com.juliuskrah;

import static org.junit.jupiter.api.Assertions.*;
import static com.juliuskrah.Recursion.*;

import org.junit.jupiter.api.Test;

class RecursionTest {

	@Test
	void testFactorial() {
		assertEquals(factorial(0), 1);
		assertEquals(factorial(5), 120);
		assertEquals(factorial(8), 40320);
		assertEquals(factorial(10), 3628800);
	}
	
	@Test
	void testPalindrome() {
		assertTrue(palindrome("a"));
		assertFalse(palindrome("motor"));
		assertTrue(palindrome("rotor"));
	}
	
	@Test
	void testPower() {
		assertEquals(power(3, 0), 1);
		assertEquals(power(3, 1), 3);
		assertEquals(power(3, 2), 9);
		assertEquals(power(3, -1), 1 / 3);
		assertEquals(power(3, 3), 27);
		assertEquals(power(4, 2), 16);
	}
	
	@Test
	void testFibonacci() {
		assertEquals(fibonacci(2), 1);
		assertEquals(fibonacci(5), 5);
		assertEquals(fibonacci(8), 21);
	}
	
	@Test
	void testFib() {
		assertEquals(fib(2), 1);
		assertEquals(fib(5), 5);
		assertEquals(fib(8), 21);
	}

}
