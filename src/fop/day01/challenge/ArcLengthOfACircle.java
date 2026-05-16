package fop.day01.challenge;

import java.util.Scanner;

public class ArcLengthOfACircle {

	public static void main(String[] args) {
		// The formula to calculate the arc length of a circle =2*pi*radius*(angle/360)

		/*
		 * Input (stdin) 25, 50
		 * 
		 * Output (stdout) 21.81
		 */

		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		double angle = sc.nextDouble();
		double ans = 2 * 3.14 * radius * (angle / 360);
		System.out.printf("%.2f", ans);
	}

}
