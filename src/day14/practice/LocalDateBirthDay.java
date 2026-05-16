package day14.practice;

import java.time.LocalDate;
public class LocalDateBirthDay {

	public static void main(String[] args) {
		// 3. Write a Java program to create a **`LocalDate`** object representing your
		// birthday.
		LocalDate birthday = LocalDate.of(2004, 10, 9);
        System.out.println("My birthday is on: " + birthday);
	}

}
