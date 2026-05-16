package day19.practice;

import day05.practice.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class AvoidDivideByZero {
	// For the same problem in 1., perform validations to avoid DivideByZero
	// Arithmetic Exception to occur on the divide method. Write a test case to
	// check if the validation works correctly.
	@Test(expected = ArithmeticException.class)
	public void testDivide() {
		Calculator calculator = new Calculator();
		double result = calculator.divide(10, 3);
		assertEquals(3.33333333333, result);
	}
	
	
	
}
