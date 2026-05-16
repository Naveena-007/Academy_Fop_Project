package day14.practice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class NumberOfDays {

	public static void main(String[] args) {

		// 4. Write a Java program to calculate the number of days between two
		// **`LocalDate`** objects.

		LocalDate date1 = LocalDate.of(2004, 10, 9);
		LocalDate date2 = LocalDate.now();
		long daysBetween = ChronoUnit.DAYS.between(date1, date2);
		double age = daysBetween/365 ;
		System.out.println(age);
		System.out.println("Days between " + date1 + " and " + date2 + " : " + daysBetween);
	}

}
