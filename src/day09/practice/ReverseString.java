package day09.practice;

import java.util.Arrays;

public class ReverseString {
	public static void main(String[] args) {

		// 4. Write a Java program that takes an array of strings as input and reverses
		// the order of elements in the array. Print the reversed array.

		String[] arr = { "Five", "Four", "Three", "Two", "one" };
		
		System.out.println("Original array: " + Arrays.toString(arr));
		
		for (int i = 0; i < arr.length / 2; i++) {
			String temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		System.out.println("Reversed array: " + Arrays.toString(arr));
	}
}
