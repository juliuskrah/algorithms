package com.juliuskrah;

import static org.junit.jupiter.api.Assertions.*;
import static com.juliuskrah.SelectionSort.*;

import org.junit.jupiter.api.Test;

class SelectionSortTest {

	@Test
	void testSelectionSort() {
		assertArrayEquals(selectionSort(new int[] { 22, 11, 99, 88, 9, 7, 42 }),
				new int[] { 7, 9, 11, 22, 42, 88, 99 });
		assertArrayEquals(selectionSort(new int[] { 5, -5, 15, 10, 1, 4, 5, -10, 100, 40 }),
				new int[] { -10, -5, 1, 4, 5, 5, 10, 15, 40, 100 });
		assertArrayEquals(selectionSort(new int[] { 10, 8, 6, 4, 2, 0, -2 }), new int[] { -2, 0, 2, 4, 6, 8, 10 });
	}

}
