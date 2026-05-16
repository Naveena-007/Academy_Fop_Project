package revisionday01.solved;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class UserValidatorTest {

	@Test
	public void testCorrectPassword() {
		User user = new User();
		UserValidator userValidator = new UserValidator();
		System.out.println("Vinit@1234");
		user.setPassword("Vinit@1234");
		if (userValidator.validatePassword(user.getPassword())) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		assertTrue(userValidator.validatePassword(user.getPassword()));
	}

	@Test
	public void testCapitalLetterMissingInPassword() {
		// Capital letter missing
		User user = new User();
		UserValidator userValidator = new UserValidator();
		System.out.println("vinit@1234");
		user.setPassword("vinit@1234");
		if (userValidator.validatePassword(user.getPassword())) {
			System.out.println("FAIL");
		} else {
			System.out.println("PASS");
		}
		assertFalse(userValidator.validatePassword(user.getPassword()));

	}

	@Test
	public void testSmallLetterMissingInPassword() {
		// Small letter missing
		User user = new User();
		UserValidator userValidator = new UserValidator();
		System.out.println("VINIT@1234");
		user.setPassword("VINIT@1234");
		if (userValidator.validatePassword(user.getPassword())) {
			System.out.println("FAIL");
		} else {
			System.out.println("PASS");
		}
		assertFalse(userValidator.validatePassword(user.getPassword()));
	}

	@Test
	public void testUsernameLengthMorethanThree() {
		User user = new User();

		UserValidator userValidator = new UserValidator();
		user.setName("su");

		if (userValidator.validateName(user.getName())) {
			System.out.println("FAIL");
		} else {
			System.out.println("PASS");
		}
		assertFalse(userValidator.validateName(user.getName()));

	}

	@Test
	public void testUsernameLengthLessThanThirty() {
		User user = new User();
		UserValidator userValidator = new UserValidator();
		user.setName("suhjkshfkjsfhkhsfkhsfkskhkshkshkhskksfhkskskhskhsfs");

		if (userValidator.validateName(user.getName())) {
			System.out.println("FAIL");
		} else {
			System.out.println("PASS");
		}
		assertFalse(userValidator.validateName(user.getName()));

	}

	@Test
	public void testUsernameOnlyTheAlphabet() {
		User user = new User();
		UserValidator userValidator = new UserValidator();
		user.setName("su1234");

		if (userValidator.validateName(user.getName())) {
			System.out.println("FAIL");
		} else {
			System.out.println("PASS");
		}
		assertFalse(userValidator.validateName(user.getName()));
	}

	@Test
	public void testUserIdLength() {
		User user = new User();
		user.setId(0);

		UserValidator userValidator = new UserValidator();

		if (userValidator.validateId(user.getId())) {
			System.out.println("FAIL");
		} else {
			System.out.println("PASS");
		}
		assertFalse(userValidator.validateId(user.getId()));

	}

	@Test
	public void testUserEmailContainAt() {

		User user = new User();

		user.setEmail("susigmail.com");
		UserValidator userValidator = new UserValidator();

		if (userValidator.validateEmail(user.getEmail())) {
			System.out.println("FAIL");
		} else {
			System.out.println("PASS");
		}
		assertFalse(userValidator.validateEmail(user.getEmail()));

	}

	@Test
	public void testUserEmailcontainDot() {

		User user = new User();

		user.setEmail("susi@gmailcom");
		UserValidator userValidator = new UserValidator();

		if (userValidator.validateEmail(user.getEmail())) {
			System.out.println("FAIL");
		} else {
			System.out.println("PASS");
		}
		assertFalse(userValidator.validateEmail(user.getEmail()));

	}

}