package com.juliuskrah;

public class MergeSort {
	/**
	 * Recursively call mergeSort to sort
	 * 
	 * @implNote time complexity O(n log_2(n)) - logarithmic time <br/>
	 *           space complexity O(n)
	 * @param array unsorted array
	 * @param p     begin index of array
	 * @param r     array.length - 1
	 */
	public static int[] mergeSort(int[] array, int p, int r) {
		if (p < r) {
			var q = Math.floorDiv(p + r, 2);
			mergeSort(array, p, q);
			mergeSort(array, q + 1, r);
			merge(array, p, q, r);
		}
		return array;
	}

	/**
	 * Merges the array after the divide and conquer phase
	 * 
	 * @param array unsorted array
	 * @param p     begin index of array
	 * @param q     median of array(floored)
	 * @param r     array.length - 1
	 */
	private static void merge(int[] array, int p, int q, int r) {
		int[] lowHalf = new int[q - p + 1];
		int[] highHalf = new int[r - q];
		var k = p;
		var i = 0;
		var j = 0;

		for (i = 0; k <= q; i++, k++) {
			lowHalf[i] = array[k];
		}
		for (j = 0; k <= r; j++, k++) {
			highHalf[j] = array[k];
		}

		k = p;
		i = 0;
		j = 0;

		while (i < lowHalf.length && j < highHalf.length) {
			if (lowHalf[i] < highHalf[j]) {
				array[k] = lowHalf[i];
				i++;
			} else {
				array[k] = highHalf[j];
				j++;
			}
			k++;
		}

		while (i < lowHalf.length) {
			array[k] = lowHalf[i];
			i++;
			k++;
		}

		while (j < highHalf.length) {
			array[k] = highHalf[j];
			j++;
			k++;
		}
	}
}
