package com.juliuskrah;

import java.lang.System.Logger;

public class SelectionSort {
	private static final Logger log = System.getLogger(SelectionSort.class.getName());
	/**
	 * Swap the values at the given indices
	 * @param array the array
	 * @param firstIndex first index
	 * @param secondIndex second index
	 */
	private static void swap(int[] array, int firstIndex, int secondIndex) {
		var temp = array[firstIndex];
		array[firstIndex] = array[secondIndex];
		array[secondIndex] = temp;
		log.log(Logger.Level.DEBUG, "Sorted array {0}", array);
	}
	
	/**
	 * Get the index of the minimum value
	 * @param array the array
	 * @param startIndex the start index
	 * @return
	 */
	private static int indexOfMinimum(int[] array, int startIndex) {
		var minValue = array[startIndex];
		var minIndex = startIndex;
		
		for(var i = minIndex + 1; i < array.length; i++) {
			if(array[i] < minValue) {
				minIndex = i;
	            minValue = array[i];
			}
		}
		log.log(Logger.Level.DEBUG, "Minimum index {0}", minIndex);
		return minIndex;
	}
	
	/**
	 * Takes an unsorted array and returns a sorted array
	 * 
	 * @implNote time complexity O(n^2) - quadratic time
	 * @param array the unsorted array
	 * @return the sorted array
	 */
	public static int[] selectionSort(int array[]) {
		var minIndex = 0;
	    for(var i = 0; i < array.length; i++) {
	        minIndex = indexOfMinimum(array, i);
	        swap(array, i, minIndex);
	    }    
	    return array;
	}
}
