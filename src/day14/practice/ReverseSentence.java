package day14.practice;

import java.util.Scanner;
public class ReverseSentence {

	public static void main(String[] args) {
		// 6. Write a program that takes a sentence as input from the user
		// and reverses the order of the words in the sentence. The program
		// should use **`StringBuilder`** to perform the reversal.
//	    Example:
//	    Input: "Hello, how are you?"
//	    Output: "you? are how Hello,"
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();

        String[] words = sentence.split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        System.out.println("Reversed sentence: " + reversed.toString().trim());
// .reverse method to change;
	}

}
