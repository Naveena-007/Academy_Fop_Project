package day04.practice;

public class Calculator {
	int num1;
	int num2;
	int sum = num1 + num2;
	int sub = num1 - num2;
	int multiplication = num1 * num2;
//	float division = num1 / num2 ;

	public static void main(String[] args) {
		
		 Calculator maths = new Calculator();
	        maths.num1 = 2;
	        maths.num2 = 3;
	        maths.sum = maths.num1 + maths.num2;
	        maths.sub = maths.num1 - maths.num2;
	        maths.multiplication = maths.num1 * maths.num2;
//	        maths.division = (float) maths.num1 / maths.num2;
	        maths.display();

	}

	public void display() {
		System.out.println(num1 + " + " + num2 + " = " + sum);
		System.out.println(num1 + " - " + num2 + " = " + sub);
		System.out.println(num1 + " * " + num2 + " = " + multiplication);
//		System.out.println(num1 + " / " + num2 + " = " + division);

	}
}