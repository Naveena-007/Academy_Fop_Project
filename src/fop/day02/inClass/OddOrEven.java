package fop.day02.inClass;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num : ");
		
		int num = sc.nextInt();
		
		String result = (num%2 == 0 )? "Even" : "Odd";
		System.out.println(result);
	}
}
