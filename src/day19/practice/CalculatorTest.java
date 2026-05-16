package day19.practice;

import day05.practice.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

	// For the Calculator class created on Day 04, write JUnit test cases. For each
	// of the methods that perform addition, subtraction, multiplication and
	// division, write test cases to check if each method works correctly.
	
	
	@Test
	public void testAddition() {
		Calculator calculator = new Calculator();
		int result = calculator.addValue(2, 3);
		assertEquals(5, result);
	}

	@Test
	public void testSubtraction() {
		Calculator calculator = new Calculator();
		int result = calculator.subtraction(5, 3);
		assertEquals(2, result);
	}

	@Test
	public void testMultiplication() {
		Calculator calculator = new Calculator();
		int result = calculator.multiplication(2, 3);
		assertEquals(6, result);
	}

	@Test
	public void testDivision() {
		Calculator calculator = new Calculator();
		double result = calculator.division(10, 2);
		assertEquals(5.0, result, 0.0001);
	}
	
	
	
}
