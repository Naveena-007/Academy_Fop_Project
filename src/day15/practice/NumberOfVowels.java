package day15.practice;

import java.util.Scanner;

public class NumberOfVowels {

	public static void main(String[] args) {
		// 2. Write a Java program that takes a string as input and counts the number of
		// vowels in it.

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				count++;
			}
		}
		System.out.println("Number of vowels in the string: " + count);

	}

}
