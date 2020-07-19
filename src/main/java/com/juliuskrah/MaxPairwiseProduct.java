package com.juliuskrah;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class MaxPairwiseProduct {
	private final static Logger log = System.getLogger(MaxPairwiseProduct.class.getName());

	public static long getMaxPairwiseProduct(int[] numbers) {
		long max_product = 0;
		int n = numbers.length;

		for (int first = 0; first < n; ++first) {
			for (int second = first + 1; second < n; ++second) {
				max_product = Math.max(max_product, (long)numbers[first] * numbers[second]);
			}
		}

		return max_product;
	}

	public static long getMaxPairwiseProductFast(int[] numbers) {
		int first = 0;

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[first] < numbers[i]) {
				first = i;
			}
		}
		int second = first == 0 ? 1 : 0;
		for (int i = 0; i < numbers.length; i++) {
			if (i != first && numbers[second] < numbers[i]) {
				second = i;
			}
		}

		return (long) numbers[first] * (long) numbers[second];
	}

	public static void main(String[] args) {
		FastScanner scanner = new FastScanner(System.in);
		int n = scanner.nextInt();
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = scanner.nextInt();
		}
		System.out.println(getMaxPairwiseProductFast(numbers));
	}

	public static void stress(Duration duration) {
		long end = Instant.now().plus(duration).toEpochMilli();
		var random = new Random(459);
		var arraySize = new Random();
		while (System.currentTimeMillis() < end) {
			var numbers = random.ints(arraySize.nextInt(20 + 1 - 2) + 2, 1, 199850).toArray();
			log.log(Level.INFO, "{0}", Arrays.toString(numbers));
			var maxSlow = getMaxPairwiseProduct(numbers);
			var maxFast = getMaxPairwiseProductFast(numbers);
			if (maxSlow != maxFast) {
				log.log(Level.ERROR, "Wrong answer: {0} {1}", maxSlow, maxFast);
				break;
			} else
				log.log(Level.INFO, "OK");

		}
	}

	static class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		FastScanner(InputStream stream) {
			try {
				br = new BufferedReader(new InputStreamReader(stream));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}
	}

}
