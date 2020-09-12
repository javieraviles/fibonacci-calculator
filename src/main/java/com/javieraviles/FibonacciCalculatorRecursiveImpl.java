package com.javieraviles;

public class FibonacciCalculatorRecursiveImpl implements IFibonacciCalculator {

	/**
	 * This solution is the worst one even though the implementation is pretty clean
	 * and dead simple. 
	 * 
	 * Time complexity O(Φ^n)
	 */
	public int nthFibonacciTerm(int n) {
		if (n == 1 || n == 0) {
			return n;
		}
		return nthFibonacciTerm(n - 1) + nthFibonacciTerm(n - 2);
	}

}
