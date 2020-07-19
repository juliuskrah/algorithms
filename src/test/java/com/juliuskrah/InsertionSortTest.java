package com.juliuskrah;

import static org.junit.jupiter.api.Assertions.*;
import static com.juliuskrah.InsertionSort.*;

import org.junit.jupiter.api.Test;

class InsertionSortTest {

	@Test
	void testInsertionSort() {
		assertArrayEquals(insertionSort(new int[] { 22, 11, 99, 88, 9, 7, 42 }),
				new int[] { 7, 9, 11, 22, 42, 88, 99 });
		assertArrayEquals(insertionSort(new int[] { 8, -5, 4, 0, 34, 25, 3 }), new int[] { -5, 0, 3, 4, 8, 25, 34 });
	}

}
