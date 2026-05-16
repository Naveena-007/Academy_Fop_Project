package day19.solved;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class UserValidatorTest {

	@Test
	public void testCorrectPassword() {
		User user = new User();
		System.out.println("Vinit@1234");
		user.setPassword("Vinit@1234");
		if (user.validatePassword()) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		assertTrue(user.validatePassword());
	}

	@Test
	public void testCapitalLetterMissingInPassword() {
		// Capital letter missing
		User user = new User();
		System.out.println("vinit@1234");
		user.setPassword("vinit@1234");
		if (user.validatePassword()) {
			System.out.println("FAIL");
		} else {
			System.out.println("PASS");
		}
		assertFalse(user.validatePassword());

	}

	@Test
	public void testSmallLetterMissingInPassword() {
		// Small letter missing

		User user = new User();
		System.out.println("VINIT@1234");
		user.setPassword("VINIT@1234");
		if (user.validatePassword()) {
			System.out.println("FAIL");
		} else {
			System.out.println("PASS");
		}
		assertFalse(user.validatePassword());
	}
	
	@Test
	public void TestLengthOfPassword() {
		// Length<8

		User user = new User();
		System.out.println("Vino@1");
		user.setPassword("Vino@1");
		if (user.validatePassword()) {
			System.out.println("FAIL");
		} else {
			System.out.println("PASS");
		}
		assertFalse(user.validatePassword());
	}

	@Test
	public void TestNumberMissingInPassword() {
		// Small letter missing

		User user = new User();
		System.out.println("Vinoth@Sr");
		user.setPassword("Vinoth@Sr");
		if (user.validatePassword()) {
			System.out.println("FAIL");
		} else {
			System.out.println("PASS");
		}
		assertFalse(user.validatePassword());
	}

	
	@Test
	public void SpecialcharacterMissingInPassword() {
		// Special character missing

		User user = new User();
		System.out.println("Vinoth1234");
		user.setPassword("Vinoth1234");
		if (user.validatePassword()) {
			System.out.println("FAIL");
		} else {
			System.out.println("PASS");
		}
		assertFalse(user.validatePassword());
	}

	
	
}