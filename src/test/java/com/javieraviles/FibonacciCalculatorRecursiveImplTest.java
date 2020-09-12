package com.javieraviles;

import com.javieraviles.FibonacciCalculatorRecursiveImpl;

public class FibonacciCalculatorRecursiveImplTest
		implements IFibonacciCalculatorTest<FibonacciCalculatorRecursiveImpl> {

	@Override
	public FibonacciCalculatorRecursiveImpl createCalculator() {
		return new FibonacciCalculatorRecursiveImpl();
	}

}
