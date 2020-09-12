package com.javieraviles;

public class FibonacciCalculatorIterativeImpl implements IFibonacciCalculator {

	/**
	 * This solution avoids redundant work done in Recursive implementation. Still not perfect.
	 * 
	 * Time complexity O(n)
	 */
	public int nthFibonacciTerm(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int f0 = 0, f1 = 1;
		int tempNthTerm;
		for (int i = 2; i <= n; i++) {
			tempNthTerm = f0 + f1;
			f0 = f1;
			f1 = tempNthTerm;
		}
		return f1;
	}

}
