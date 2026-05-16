package day05.practice;

public class Calculator {

	public int addValue(int num1, int num2) {
		return num1 + num2;
	}

	public int subtraction(int num1, int num2) {
		return num1 - num2;
	}

	public int multiplication(int num1, int num2) {
		return num1 * num2;
	}

	public double division(int num1, int num2) {

		if (num2 == 0) {
			throw new IllegalArgumentException("Cannot divid by Zero");
		}
		return num1 % num2;
	}

	public double divide(double num1, double num2) {
		if (num2 == 0) {
			throw new ArithmeticException("Cannot divide by zero");
		}
		return num1 / num2;
	}

	public static void main(String[] args) {

		Calculator calculator = new Calculator();

		int num1 = 45;
		int num2 = 35;

		// Addition
		int added = calculator.addValue(num1, num2);
		System.out.println("Addition = " + added);
		// Subtraction
		int sub = calculator.subtraction(num1, num2);
		System.out.println("Subtraction = " + sub);
		// Multiplication
		int multiple = calculator.multiplication(num1, num2);
		System.out.println("Multiplication = " + multiple);
		// Division
		double divis = calculator.division(num1, num2);
		System.out.println("Division = " + divis);

	}
}
