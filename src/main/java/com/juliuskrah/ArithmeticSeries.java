package com.juliuskrah;

import java.util.stream.IntStream;

public class ArithmeticSeries {
	
	/**
	 * Sum all items in the array
	 * 
	 * @implNote time complexity O(1) - constant time
	 * @param array
	 * @return the sum of items
	 */
	public static long sum(int[] array) {
		var n = array.length;
		return Double.valueOf((n + 1) * ((double)n / 2)).longValue();
	}

	/**
	 * Sum all items in the array using Stream API
	 * 
	 * @implNote time complexity 0(1) - constant time
	 * @param array
	 * @return the sum of items
	 */
	public static long streamSum(int[] array) {
		return IntStream.of(array).sum();
	}
}
