package com.juliuskrah;

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
}
