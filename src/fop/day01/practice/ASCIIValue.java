package fop.day01.practice;

import java.util.Scanner;

public class ASCIIValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter charcter: ");
		char ch = sc.next().charAt(0);
		System.out.println((int) ch);

		System.out.println("Enter Number: ");
		int nu = sc.nextInt();
		System.out.println((char) nu);
	}

}
