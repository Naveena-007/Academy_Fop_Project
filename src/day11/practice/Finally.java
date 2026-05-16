package day11.practice;

public class Finally {
	public static void main(String[] args) {
		try {
			throw new IllegalArgumentException("Invalid"); // code that might throw an exception
		} catch (Exception e) {
			System.out.println("Catch");
			// code to handle the exception
		} finally {
			System.out.println("Program completes");
			// code to be executed regardless of an exception
		}
	}
}
