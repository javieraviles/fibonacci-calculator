package com.javieraviles;

import com.javieraviles.FibonacciCalculatorIterativeImpl;

public class FibonacciCalculatorIterativeImplTest
		implements IFibonacciCalculatorTest<FibonacciCalculatorIterativeImpl> {

	@Override
	public FibonacciCalculatorIterativeImpl createCalculator() {
		return new FibonacciCalculatorIterativeImpl();
	}

}
