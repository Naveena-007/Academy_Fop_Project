package day14.practice;

public class StringBulider {

	public static void main(String[] args) {
		// 7. **Insert a string** at a specific position in a `StringBuilder` using the
		// `insert()` method
		
		StringBuilder sb = new StringBuilder("Hello, world!");
		sb.insert(7, "Java ");
		System.out.println(sb.toString());
	}
}
