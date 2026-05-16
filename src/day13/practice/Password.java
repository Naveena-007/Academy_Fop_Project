package day13.practice;

public class Password {

	public static void main(String[] args) {
		// 4. Write a Java method to validate a password. A valid password should
		// contain at least one uppercase letter, one lowercase letter, one digit, and
		// one special character, and it should be at least 8 characters long.

		String password = "Password@123";
		boolean isValid = validatePassword(password);
		System.out.println("This Strong password  is valid " + isValid);
	}

	public static boolean validatePassword(String password) {
		int minLength = 8;
		String uppercaseRegex = ".*[A-Z].*";
		String lowercaseRegex = ".*[a-z].*";
		String digitRegex = ".*\\d.*";
		String specialCharRegex = ".*[!@#$%^&*()-+=<>?].*";
		if (password.length() < minLength) {
			return false;
		}
		if (!password.matches(uppercaseRegex)) {
			return false;
		}
		if (!password.matches(lowercaseRegex)) {
			return false;
		}
		if (!password.matches(digitRegex)) {
			return false;
		}
		if (!password.matches(specialCharRegex)) {
			return false;
		}
		return true;
	}

}
