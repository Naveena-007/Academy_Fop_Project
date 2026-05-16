package day18.solved;

//import day18.solved.Calculator;

public class CalculatorTest {

	public static void main(String[] args) {

		Calculator call = new Calculator();

		// addition
		int addition = call.addValue(7, 5);
		if (addition == 12) {
			System.out.println("Calculator addition  is working");
		} else {
			System.out.println("Calculator addition  is not working");
		}

		// subtraction
		int sub = call.subtraction(7, 5);
		if (sub == 2) {
			System.out.println("Calculator subtraction  is working");
		} else {
			System.out.println("Calculator subtraction  is not working");
		}

		// multiplication
		int multi = call.multiplication(7, 5);
		if (multi == 35) {
			System.out.println("Calculator multiplication  is working");
		} else {
			System.out.println("Calculator multiplication  is not working");
		}

		// division
		double div = call.division(4, 2);
		if (div == 2.0) {
			System.out.println("Calculator division  is working");
		} else {
			System.out.println("Calculator division  is not working");
		}

		// mod
		double mod = call.mod(21, 2);
		if (mod == 1) {
			System.out.println("Calculator mod  is working");
		} else {
			System.out.println("Calculator mod  is not working");
		}
		
		
		try {
	         double f = call.division(2,0);
	         System.out.println("Calculator division by zero is not working");
	     } catch (ArithmeticException ex) {
	         System.out.println("Calculator division by zero validation is working");
	     }
	}

}
