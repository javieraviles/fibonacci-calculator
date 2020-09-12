package com.javieraviles;

/**
 * Binet's Formula (Sn = Φⁿ–(– Φ⁻ⁿ)/√5)
 * 
 * Since this is a constant-time solution O(1), is the best one performance-wise
 */
public class FibonacciCalculatorBinetImpl implements IFibonacciCalculator {

	public int nthFibonacciTerm(int n) {
		double squareRootOf5 = Math.sqrt(5);
		double phi = (1 + squareRootOf5) / 2;
		return (int) ((Math.pow(phi, n) - Math.pow(-phi, -n)) / squareRootOf5);
	}

}
