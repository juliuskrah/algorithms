package com.juliuskrah;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;
import java.util.Random;
import java.util.stream.IntStream;

import org.junit.jupiter.api.BeforeAll;

import static com.juliuskrah.MaxPairwiseProduct.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class MaxPairwiseProductTest {
	private int[] numbers = null;

	@BeforeAll
	void init() {
		var random = new Random();
		numbers = IntStream.generate(() -> random.nextInt(2 * 100000)).limit(200000).toArray();
	}

	@Test
	void testMaxPairwiseProduct() {
		assertEquals(getMaxPairwiseProduct(new int[] { 1, 2, 3 }), 6);
		assertEquals(getMaxPairwiseProduct(new int[] { 7, 5, 14, 2, 8, 8, 10, 1, 2, 3 }), 140);
	}

	@Test
	void testMaxPairwiseProductFast() {
		assertEquals(getMaxPairwiseProductFast(new int[] { 100000, 90000 }), 9000000000l);
		assertEquals(getMaxPairwiseProductFast(new int[] { 7, 5, 14, 2, 8, 8, 10, 1, 2, 3 }), 140);
	}

	@Test
	void testMaxAgainstTime() {
		assertTimeout(Duration.ofSeconds(1), () -> getMaxPairwiseProductFast(numbers));
	}
	
	@Test
	void stressTest() {
		assertDoesNotThrow(() -> stress(Duration.ofSeconds(60)));
	}
}
