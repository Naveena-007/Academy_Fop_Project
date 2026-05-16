package day11.solved;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CompileTimeExceptionDemo {

	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader("example.txt"); // This line may throw a FileNotFoundException
		} catch (FileNotFoundException e) {
			e.printStackTrace(); // Handle the exception by printing the stack trace
			System.out.println("Please provide valid Filename.");
		}
	}
}
