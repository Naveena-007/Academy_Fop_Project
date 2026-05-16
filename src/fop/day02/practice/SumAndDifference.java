package fop.day02.practice;

import java.util.Scanner;

public class SumAndDifference {
	public static void main(String args[]) {
		// fill your code
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num 1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter num 2 : ");
		int num2 = sc.nextInt();

		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);

	}
}
