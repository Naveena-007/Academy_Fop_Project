package day14.practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateAndTime {
	public static void main(String[] args) {
		// 2. Write a Java program to display the current date and time using the
		// **`LocalDateTime`** class.

		LocalDateTime currentDateTime = LocalDateTime.now();
		
		DateTimeFormatter date = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		String formattedDate = currentDateTime.format(date);
		String formattedTime = currentDateTime.format(time);
		
		System.out.println("Current date : " + formattedDate);
		System.out.println("Current time : " + formattedTime);
	}
}
