package com.juliuskrah;

import java.util.stream.IntStream;

public class ArithmeticSeries {
	
    /**
     * Sum all items in the array.
     *
     * @implNote time complexity O(n) - linear time
     * @param array input values
     * @return the sum of items
     */
    public static long sum(int[] array) {
            long result = 0;
            for (int value : array) {
                    result += value;
            }
            return result;
    }

    /**
     * Sum all items in the array using Stream API.
     *
     * @implNote time complexity O(n) - linear time
     * @param array input values
     * @return the sum of items
     */
    public static long streamSum(int[] array) {
            return IntStream.of(array).sum();
    }
}
