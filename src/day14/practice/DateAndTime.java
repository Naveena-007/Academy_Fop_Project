package day14.practice;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateAndTime {

	public static void main(String[] args) {
		// 5. Write a Java program that uses the **`Date`** class to print the current
		// date and time in the following format: "Today's date is MM/DD/YYYY and
		// current time is HH:MM:SS".

		Date currentDate = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		String formattedDate = formatter.format(currentDate);
		System.out.println("Today's date is " + formattedDate);
	}
}
