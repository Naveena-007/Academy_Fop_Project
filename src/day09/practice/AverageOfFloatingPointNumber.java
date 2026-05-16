package day09.practice;

import java.util.Scanner;

public class AverageOfFloatingPointNumber {
	public static void main(String[] args) {

		// 3. Write a Java program that takes an array of floating-point numbers as
		// input and calculates the average of the numbers. Print the average value.

		Scanner input = new Scanner(System.in); // create a object
		System.out.print("Enter the number of elements: "); // users work
		int n = input.nextInt(); // store it in a variable and for reading

		double[] array = new double[n]; // create an array
		double sum = 0;

		System.out.println("Enter the elements:");
		for (int i = 0; i < n; i++) {
			array[i] = input.nextDouble();
			sum += array[i];
		}

		System.out.println("The sum of all the given numbers = " + sum);
		System.out.println("The Number elements in the array = " + n);

		double average = sum / n;
		System.out.println("The average of the elements is: " + average);

	}
}
