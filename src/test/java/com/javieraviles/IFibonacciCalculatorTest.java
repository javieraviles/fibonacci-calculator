package com.javieraviles;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.javieraviles.IFibonacciCalculator;

public interface IFibonacciCalculatorTest<T extends IFibonacciCalculator> {
	
	T createCalculator();

	@ParameterizedTest(name = "nth term of {0} should be {1}")
	@CsvSource({
		"0,		0",
		"1,		1",
		"19,	4181",
		"30,	832040"
	})
	default void whenCalculatingNthFibonacciTerm_shouldReturnExpectedResult(final int n, final int expectedNthTerm) {
		assertEquals(expectedNthTerm, createCalculator().nthFibonacciTerm(n),
				() -> " nth term of " + n + " should equal " + expectedNthTerm);
	}

}
