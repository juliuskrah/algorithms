package com.juliuskrah;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;
import static com.juliuskrah.ReverseArray.reverseInplace;

public class ReverseArrayTest {
    
    @Test
	void testReverseInplace() {
		assertArrayEquals(reverseInplace(new int[] { 22, 11, 99, 88, 9, 7, 42 }),
				new int[] { 42, 7, 9, 88, 99, 11, 22 });
		assertArrayEquals(reverseInplace(new int[] { 8, -5, 4, 0, 34, 25, 3 }), new int[] { 3, 25, 34, 0, 4, -5, 8 });
		assertArrayEquals(reverseInplace(new int[] { 11, 14, 12, 2, 6, 3, 9, 7 }),
				new int[] { 7, 9, 3, 6, 2, 12, 14, 11 });
		assertArrayEquals(
            reverseInplace(new int[] { 185968, 9302, 97007, 71703, 77583, 11681, 64843, 192257, 38425, 154725, 141599,
						62744, 190222 }),
				new int[] { 190222, 62744, 141599, 154725, 38425, 192257, 64843, 11681, 77583, 71703, 97007, 9302,
                    185968 });
		assertArrayEquals(reverseInplace(new int[] { 185968, 9302, 97007, 71703 }),
				new int[] { 71703, 97007, 9302, 185968 });
	}
}
