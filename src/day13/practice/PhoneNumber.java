package day13.practice;

//import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {

	public static void main(String[] args) {
		// 1. Write a Java method to validate a phone number. A valid phone number
		// consists of 10 digits.

		String PhoneNumber = "9876986123";
		if (PhoneNumber.length() < 10) {
			System.out.println("This phone number is less than 10 digit");
		} else if (PhoneNumber.length() > 10) {
			System.out.println("This phone number is more than 10 digit");
		} else {
			System.out.println("This is correct Phone Number");
		}
	}

}
