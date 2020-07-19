package com.juliuskrah;

import static org.junit.jupiter.api.Assertions.*;
import static com.juliuskrah.QuickSort.*;

import org.junit.jupiter.api.Test;

class QuickSortTest {

	@Test
	void testQuickSort() {
		assertArrayEquals(quickSort(new int[] { 22, 11, 99, 88, 9, 7, 42 }, 0, 6),
				new int[] { 7, 9, 11, 22, 42, 88, 99 });
		assertArrayEquals(quickSort(new int[] { 8, -5, 4, 0, 34, 25, 3 }, 0, 6), new int[] { -5, 0, 3, 4, 8, 25, 34 });
		assertArrayEquals(quickSort(new int[] { 11, 14, 12, 2, 6, 3, 9, 7 }, 0, 7),
				new int[] { 2, 3, 6, 7, 9, 11, 12, 14 });
		assertArrayEquals(
				quickSort(new int[] { 185968, 9302, 97007, 71703, 77583, 11681, 64843, 192257, 38425, 154725, 141599,
						62744, 190222 }, 0, 12),
				new int[] { 9302, 11681, 38425, 62744, 64843, 71703, 77583, 97007, 141599, 154725, 185968, 190222,
						192257 });
		assertArrayEquals(quickSort(new int[] { 185968, 9302, 97007, 71703 }, 0, 3),
				new int[] { 9302, 71703, 97007, 185968 });
	}

}
