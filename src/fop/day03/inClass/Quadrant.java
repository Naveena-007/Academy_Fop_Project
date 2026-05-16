package fop.day03.inClass;

import java.util.Scanner;

public class Quadrant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a :");
		int a = sc.nextInt();
		System.out.println("Enter b :");
		int b = sc.nextInt();
		
		if(a > 0 && b> 0) {
			System.out.println("Ist Quadrant");
		}else if(a < 0 && b> 0) {
			System.out.println("IInd Quadrant");
		}
		else if(a < 0 && b< 0) {
			System.out.println("IIIrd Quadrant");
		}else if (a > 0 && b< 0){
			System.out.println("IVth Quadrant");
		}
		
		
	}

}
