package day11.practice;

public class UserAccount {

	public static void validateUsername(String username) throws IllegalArgumentException {
		if (username == null) {
			throw new IllegalArgumentException("Invalid Username"); // throw an Illegal Argument Exception
			// error message "Invalid Username"
		}

		if (username.length() < 8) {
			throw new IllegalArgumentException("Username must have atleast 8 chars");// throw an Illegal Argument
																						// Exception
			// with message "Username must have atleast 8 chars";
		}
	}

	public static void validateAge(int age) throws IllegalArgumentException {
		if (age < 0 || age > 150) {
			throw new IllegalArgumentException("Invalid age"); // Throw an IllegalArgumentException With error msg
																// "Invalid age"
		}
	}
	
public class IllegalArgumentExceptionPracticeCode {

	public static void main(String[] args) {
		// Fix the compiler Errors as well after removing the
		// valid lines of code
		String username = "n";

		try {
			UserAccount.validateUsername(username);
			int age = 3 ;  // Add code to validate age
			UserAccount.validateAge(age);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}
}

