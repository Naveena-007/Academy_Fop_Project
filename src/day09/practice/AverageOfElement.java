package day09.practice;

public class AverageOfElement {

	public static void main(String[] args) {
	//	1. Write a Java program to find the average of elements in an array.
		
		int[] array = { 1, 2, 3, 4, 5};
		int sum = 0;
		
		System.out.println("Array size is: " + array.length);
		
		for (int i = 0; i < array.length ; i++) {
			sum += array[i];
		}

		int average = sum / array.length ;
		System.out.println(average);
		
	}
}
