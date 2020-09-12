package com.javieraviles;

import com.javieraviles.FibonacciCalculatorBinetImpl;

public class FibonacciCalculatorBinetImplTest implements IFibonacciCalculatorTest<FibonacciCalculatorBinetImpl> {

	@Override
	public FibonacciCalculatorBinetImpl createCalculator() {
		return new FibonacciCalculatorBinetImpl();
	}

}
