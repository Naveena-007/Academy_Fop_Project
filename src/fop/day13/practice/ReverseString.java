package fop.day13.practice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter String: ");
		String n = sc.nextLine();
		String str = "";
		char m;

		for (int i = 0; i < n.length(); i++) {
			m = n.charAt(i);
			str = m + str;
		}
		System.out.println(str);
		sc.close();
	}

}
