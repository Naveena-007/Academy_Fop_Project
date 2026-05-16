package fop.day02.inClass;

import java.util.Scanner;

public class PogoStick {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("num1:");
		int num1 = sc.nextInt();
		System.out.println("num2:");
		int num2 = sc.nextInt();

		int pogo = (int) ((int) Math.pow(num1 - 3, 2) + Math.pow(num2 - 4, 2));
		System.out.println(Math.floor(Math.sqrt(pogo)));
	}
}
