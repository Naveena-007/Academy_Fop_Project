package fop.day13.practice;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter String :");
		String input = sc.nextLine();
		int count = 0;

		for (int i = 0; i < input.length(); i++) {
			char ch = Character.toLowerCase(input.charAt(i));
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}

		System.out.print(count);

	}

}
