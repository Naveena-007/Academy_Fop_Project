package fop.day02.inClass;

import java.util.Scanner;

public class StepWiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a int:");
		int a = sc.nextInt();

		System.out.println("Enter a float: ");
		float b = sc.nextFloat();

		System.out.println("Enter a double:");
		double c = sc.nextDouble();

		System.out.println("Enter a long:");
		long l = sc.nextLong();

		System.out.println("Enter a String:");
		String d = sc.next();

		System.out.printf("%.1f", (float) (b / c));
		System.out.print(" " + (int) (c / a));
		System.out.println(" " + (int) ((c / a) + l));

		System.out.print(d + " ");
		System.out.print(d.charAt(3));
	}

}
