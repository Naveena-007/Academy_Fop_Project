package fop.day01.inClass;

import java.util.Scanner;

public class TrendyNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three Number");
		String n = sc.nextLine();

		if (n.length() != 3) {
			System.out.println("Invalid input");
		} else if (n.charAt(1) % 3 == 0) {
			System.out.println("This is a Trendy number");
		} else {
			System.out.println("This is not a Trendy number");
		}
	}
}
