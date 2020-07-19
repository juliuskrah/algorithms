package com.juliuskrah;

import static org.junit.jupiter.api.Assertions.*;
import static com.juliuskrah.ArithmeticSeries.*;

import org.junit.jupiter.api.Test;

class ArithmeticSeriesTest {
	@Test
	void testSum() {
		assertEquals(sum(new int[] { 1, 3, 2, 5, 4 }), 15);
		assertEquals(sum(new int[] { 1, 6, 2, 8, 4, 7, 5, 3 }), 36);
	}
}
