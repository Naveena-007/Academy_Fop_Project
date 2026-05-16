package day10.practice;

import java.util.Scanner;

public class AverageMark {

	public static void main(String[] args) {

//		1. Read two integers *totalMarks* and *noOfSubjects.* Find the overall average
//		(*totalMarks/noOfSubjects) .* How will you handle the case when *noOfSubjects* is 0

		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of Subject: ");
		int noofSub = s.nextInt();

		int[] array = new int[noofSub];
		int sum = 0;

		System.out.println("Enter all the Subject mark");
		for (int i = 0; i < noofSub; i++) {
			array[i] = s.nextInt();
			sum += array[i];
		}

		int average = sum / noofSub ;
		System.out.println("The average of the marks is: " + average);

	}
}
