package day15.practice;

import java.util.Scanner;

public class DuplicateRemove {

	public static void main(String[] args) {
		// 3. Write a Java program that accepts a string from the user and removes all
		// duplicate characters from it.
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (output.indexOf(ch) == -1) {
				output += ch;
			}
		}
		System.out.println("String after removing duplicates: " + output);

	}
}
