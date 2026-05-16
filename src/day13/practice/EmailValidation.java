package day13.practice;

import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {

		String email = "navee.naga@freshworks.com";
		String regex = "^[a-zA-Z][a-zA-Z0-9._-]*@[a-zA-Z][a-zA-Z0-9._-]*\\.[a-zA-Z]{2,}$";
		boolean isMatch = Pattern.matches(regex, email);

		if (isMatch) {
			System.out.println("The email address is: Valid");
		} else {
			System.out.println("The email address is: Invalid");
		}
	}
}
