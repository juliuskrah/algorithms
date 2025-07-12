package com.juliuskrah;

public class Recursion {
	/**
	 * Factorial function. Computes the factorial for n
	 * 
	 * @implNote time complexity O(n) - linear time
	 * @return the product
	 * @param n the number to compute
	 */
	public static long factorial(int n) {
		if (n == 0)
			return 1;
		return n * factorial(n - 1);
	}

	/**
	 * Checks that given string is a palindrome
	 * 
	 * @implNote time complexity O(log_2(n)) - logarithmic time
	 * @param str the input
	 * @return true if palindrome
	 */
	public static boolean palindrome(String str) {
		if (str == null || str.length() <= 1)
			return true;
		if (str.charAt(0) != str.charAt(str.length() - 1))
			return false;
		return palindrome(str.substring(1, str.length() - 1));
	}

    /**
     * Computes the power of a real number.
     *
     * @implNote time complexity O(log_2(n)) - logarithmic time
     * @param x the number to compute power for
     * @param n the exponent
     * @return {@code x} raised to {@code n}
     */
    public static double power(int x, int n) {
            if (n == 0) {
                    return 1;
            }
            if (n < 0) {
                    return 1.0 / power(x, -n);
            }
            if (n % 2 != 0) {
                    return x * power(x, n - 1);
            }
            double y = power(x, n / 2);
            return y * y;
    }

	/**
	 * Recursion to solve fibonacci sequence
	 * 
	 * @implNote time complexity O(n^2) - quadratic time
	 * @param n the input
	 * @return sequence number
	 */
	public static long fibonacci(int n) {
		if (n == 0 || n == 1) {
			return n;
		}

		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	/**
	 * Fibonacci using Bottom Up approach
	 * 
	 * @implNote time complexity O(n) - linear time
	 * @param n the input
	 * @return sequence number
	 */
	public static long fib(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		
		var oneBehind = 1;
		var twoBehind = 0;
		var result = 0;
		
		for(var i = 1; i < n; i++) {
			result = oneBehind + twoBehind;
			twoBehind = oneBehind;
			oneBehind = result;
		}
		
		return result;
	}
}
