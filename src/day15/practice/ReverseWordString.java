package day15.practice;

import java.util.Scanner;

public class ReverseWordString {

	public static void main(String[] args) {
		// 4. Write a Java program that reads a sentence from the user and then
		// rearranges the words in reverse order
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String input = scanner.nextLine();
		String[] words = input.split(" ");
		String output = "";
		for (int i = words.length - 1; i >= 0; i--) {
			output += words[i] + " ";
		}
		System.out.println("Reversed sentence: " + output.trim());
	}

}
