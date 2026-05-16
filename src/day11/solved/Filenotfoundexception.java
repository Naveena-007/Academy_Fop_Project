package day11.solved;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Filenotfoundexception {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Filenotfoundexception f = new Filenotfoundexception();
		try {
			f.filenotfound();
		} catch (FileNotFoundException e) {
			System.out.println("File not exists");
//			e.printStackTrace(); // Handle the exception by printing the stack trace
		}

	}

	public void filenotfound() throws FileNotFoundException {
		try {
			FileReader fileReader = new FileReader("example.txt"); // This line may throw a FileNotFoundException
			System.out.println("Line 23");

		} catch (FileNotFoundException e) {
			System.out.println("line 26");
			throw new FileNotFoundException("Thrown exception");
			// e.printStackTrace(); // Handle the exception by printing the stack trace
		}
		System.out.println("line 25");

	}

}