package com.juliuskrah;

import java.lang.System.Logger;

public class BinarySearch {
	private static final Logger log = System.getLogger(BinarySearch.class.getName());

	/**
	 * When searching an ordered Array
	 * 
	 * @implNote time complexity O(log_2(n)) - logarithmic time
	 * 
	 * @see https://www.khanacademy.org/computing/computer-science/algorithms/binary-search/a/implementing-binary-search-of-an-array
	 * @return the index for target
	 */
	public static int binarySearch(int[] array, int target) {
		var min = 0;
		var max = array.length - 1;
		var guess = 0;
		// When max is less than min, then target is not in array
		while (min <= max) {
			// get average of min and max
			guess = Math.floorDiv(min + max, 2);
			log.log(Logger.Level.DEBUG, "Guess: {0}", guess);
			if (array[guess] == target) { // return when target matches guess index
				return guess;
			} else if (array[guess] < target) { // if guess index is less than target, increment min
				min = guess + 1;
			} else { // if guess index is greater than target, decrement max
				max = guess - 1;
			}
		}
		return -1;
	}
}
