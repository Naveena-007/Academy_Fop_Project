package fop.day01.challenge;

import java.util.Scanner;

public class CelsiusIntoFahrenheitAndkelvin {

	public static void main(String[] args) {
		/*
		 * Write a program to convert the temperature Celsius into Fahrenheit and
		 * kelvin. Input (stdin) 10
		 * 
		 * Output (stdout) 50.00 ,283.15
		 */

		Scanner sc = new Scanner(System.in);
		double value = sc.nextDouble();
		System.out.printf("%.2f\n", (value * 9 / 5) + 32);
		System.out.printf("%.2f", value + 273.15);
	}

}
