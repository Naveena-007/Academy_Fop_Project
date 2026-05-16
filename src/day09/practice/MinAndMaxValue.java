package day09.practice;

public class MinAndMaxValue {

	public static void main(String[] args) {
		// 2. Write a Java program that takes an array of integers as input and finds
		// the maximum and minimum values in the array. Print both the maximum and minimum values.
		
		int[] array = { 11,1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ,0,-3};
		
		int min=Integer.MAX_VALUE;
	       int max=Integer.MIN_VALUE;
	       for(int i=0;i< array.length;i++)
	       {
	         if(array[i]<min)
	           {
	           min=array[i];
	           }
	         if(array[i]>max)
	         {
	           max=array[i];
	         }
	       }
	       System.out.println("Maximum element is "+max);
	       System.out.println("Minimum element is "+min);
	       

	}
}
