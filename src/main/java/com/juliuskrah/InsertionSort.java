package com.juliuskrah;

public class InsertionSort {
	private static void insert(int[] array, int rightIndex, int value) {
		int key;
		for (key = rightIndex; key >= 0 && array[key] > value; key--) {
			array[key + 1] = array[key];
		}
		array[key + 1] = value;
	}

	/**
	 * Takes an unsorted array and returns a sorted array
	 * 
	 * @implNote time complexity O(n^2) - quadratic time
	 * @param array the unsorted array
	 * @return the sorted array
	 */
	public static int[] insertionSort(int[] array) {
		for (var i = 1; i < array.length; i++) {
			insert(array, i - 1, array[i]);
		}
		return array;
	}
}
