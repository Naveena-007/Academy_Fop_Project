package fop.day01.practice;

import java.util.Scanner;

public class TsunamiReport {

	public static void main(String[] args) {

		/*
		 * Input (stdin) 2000 3000 10000
		 * 
		 * Output (stdout) 1)Dead : 2000 2)Injured : 3000 3)Safe : 10000 Please help the
		 * people who are suffering!!!
		 */

		Scanner sc = new Scanner(System.in);

		int d = sc.nextInt();
		System.out.println("1)Dead : " + d);

		int i = sc.nextInt();
		System.out.println("2)Injured : " + i);

		int s = sc.nextInt();
		System.out.println("3)Safe : " + s);

		System.out.println("Please help the people who are suffering!!!");
	}

}
