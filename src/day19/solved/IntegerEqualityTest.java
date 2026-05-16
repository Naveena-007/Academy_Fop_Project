package day19.solved;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerEqualityTest {

	@Test
	public void testEquality() {
		int expected = 5;
		int actual = 2 + 3;
		assertEquals(expected, actual, "The sum should be equal to 5");
	}
}