package day15.practice;

import java.util.Scanner;

public class NameAndAge {

	public static void main(String[] args) {

		// 1. Write a Java program that prompts the user for their name and age and then
		// prints a message saying "Hello, [name]. Next year, you'll be [age+1]".
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Name : ");
		String name = scanner.nextLine();
		System.out.println("Enter your Age :");
		int age = scanner.nextInt();
		int next = age + 1;

		System.out.println("Hello, " + name);
		System.out.println("Next year, you'll be " + next);
	}
}
