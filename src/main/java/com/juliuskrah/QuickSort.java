package com.juliuskrah;

public class QuickSort {
	/**
	 * Implements quick sort
	 * 
	 * @implNote time complexity O(n^2) - quadratic time
	 * @param array unsorted array
	 * @param p     first index
	 * @param r     last index
	 * @return
	 */
	static int[] quickSort(int[] array, int p, int r) {
		if (p < r) {
			var pivot = partition(array, p, r);
			quickSort(array, p, pivot - 1);
			quickSort(array, pivot + 1, r);
		}
		return array;
	}

	private static int partition(int[] array, int p, int r) {
		var i = p;
		for (var j = p; j <= r - 1; j++) {
			if (array[j] <= array[r]) {
				swap(array, i, j);
				i++;
			}
		}
		swap(array, i, r);
		return i;
	}

	private static void swap(int[] array, int i, int j) {
		var temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}
}
