package fop.day14;

import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a : ");
		int n = sc.nextInt();

		int a = 3;
		int b = 8;
		System.out.print(a +" "+ b+" ");
		
		for (int i = 2; i < n; i++) {
			int sum = a + b;
			System.out.print((sum + i) + " ");
			a = sum;
		}
	}
}
