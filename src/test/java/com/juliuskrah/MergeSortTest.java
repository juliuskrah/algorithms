package com.juliuskrah;

import static org.junit.jupiter.api.Assertions.*;
import static com.juliuskrah.MergeSort.*;

import org.junit.jupiter.api.Test;

class MergeSortTest {

	@Test
	void testMergeSort() {
		assertArrayEquals(mergeSort(new int[] { 22, 11, 99, 88, 9, 7, 42 }, 0, 6),
				new int[] { 7, 9, 11, 22, 42, 88, 99 });
		assertArrayEquals(mergeSort(new int[] { 8, -5, 4, 0, 34, 25, 3 }, 0, 6), 
				new int[] { -5, 0, 3, 4, 8, 25, 34 });
		assertArrayEquals(mergeSort(new int[] { 11, 14, 12, 2, 6, 3, 9, 7 }, 0, 7),
				new int[] { 2, 3, 6, 7, 9, 11, 12, 14 });
	}

}
