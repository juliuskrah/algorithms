package com.juliuskrah;

import static org.junit.jupiter.api.Assertions.*;
import static com.juliuskrah.BinarySearch.*;
import static com.juliuskrah.SelectionSort.selectionSort;

import org.junit.jupiter.api.Test;

class BinarySearchTest {

	@Test
	void testBinarySearch() {
		int primes[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 
				47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97 };
		assertEquals(binarySearch(primes, 73), 20);
		assertEquals(binarySearch(primes, 17), 6);
		assertEquals(binarySearch(primes, 31), 10);
	}

	@Test
	void testSortAndSearch() {
		int array[] = selectionSort(new int[] { 22, 11, 99, 88, 9, 7, 42 });
		assertEquals(binarySearch(array, 99), 6);
	}

}
