package fop.day05.practice;

// import java.util.Scanner;

public class Add2DArray {

	public static int[][] sumOf2DArrays(int[][] arr1, int[][] arr2) {
		int rows = arr1.length;
		int columns = arr1[0].length;

		int[][] result = new int[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				result[i][j] = arr1[i][j] + arr2[i][j];
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[][] array1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] array2 = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };

		int[][] sumResult = sumOf2DArrays(array1, array2);

		// Printing the sumResult array
		for (int i = 0; i < sumResult.length; i++) {
			for (int j = 0; j < sumResult[i].length; j++) {
				System.out.print(sumResult[i][j] + " ");
			}
			System.out.println();
		}
	}
}
