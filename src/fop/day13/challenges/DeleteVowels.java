package fop.day13.challenges;

import java.util.Scanner;

public class DeleteVowels {

	public static void main(String args[]) {
		// Try out your code here
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		char ch;
		for (int i = 0; i < n.length(); i++) {
			ch = n.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				continue;
			} else {
				System.out.print(ch);
			}
		}
	}
}
