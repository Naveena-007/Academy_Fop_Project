package fop.day14;

import java.util.Scanner;

public class AddIntNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n : ");
		int n = sc.nextInt();
		int a = 0; 
		while (n != 0) {
			int x = n % 10;
			n = n / 10;
			System.out.println(x);
			a = x+a;
		}
		
		System.out.println(a);
		
	}
}
