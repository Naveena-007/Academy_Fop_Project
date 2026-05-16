package day09.solved;

public class ArrayDemo {

	public static void main(String[] args) {

		// Array with a length of 3
        //int store
		int[] marks = new int[5];
		// character store
		char[] character = new char[7];

		// assign marks in the array
		marks[0] = 50;
		marks[1] = 60;
		marks[2] = 90;
		character[0] = 'a';
		character[1] = 'h';
		character[2] = 'k';
		character[3] = 'v';
		character[4] = 't';
		character[5] = 'l';

		// find how many items in the array
		System.out.println("Array size is: " + marks.length);
		System.out.println("Array size is: " + character.length);

		// Iterate array using for loop
		for (int i = 0; i < marks.length; i++) {
			int m = marks[i];
			System.out.println("Mark is: " + m);
		}

		for (char i = 0; i < character.length; i++) {
			char m = character[i];
			System.out.println("character is : " + m);
		}
		

	}

}
