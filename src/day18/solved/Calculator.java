package day18.solved;

public class Calculator {

	public int addValue(int number_1, int number_2) {
		return number_1 + number_2;
	}

	public int subtraction(int number_1, int number_2) {
		return number_1 - number_2;
	}

	public int multiplication(int number_1, int number_2) {
		return number_1 * number_2;
	}

	public double division(int number_1, int number_2) {

		if (number_2 == 0) {
			throw new IllegalArgumentException("Cannot divid by Zero");
		}
		return number_1 / number_2;
	}

	public double mod(int number_1, int number_2) {
		return number_1 % number_2;

	}

}
