package fop.day04.practice;

import java.util.Scanner;

public class CircleIntersection {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Read inputs
	        int x1 = scanner.nextInt();
	        int y1 = scanner.nextInt();
	        int r1 = scanner.nextInt();
	        int x2 = scanner.nextInt();
	        int y2 = scanner.nextInt();
	        int r2 = scanner.nextInt();

	        // Determine the distance between the centers of the circles
	        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

	        // Determine the relationship between the circles based on the distance and radii
	        String intersectionType = determineIntersectionType(distance, r1, r2);

	        // Print the result
	        System.out.println(intersectionType);

	        scanner.close();
	    }

	    public static String determineIntersectionType(double distance, int r1, int r2) {
	        if (distance == r1 - r2) {
	            return "Tangential";
	        } else if (distance < r1 + r2 && distance > Math.abs(r1 - r2)) {
	            return "Overlap";
	        } else if (distance <= Math.abs(r1 + r2)) {
	            return "Completely Contained";
	        } else {
	            return "Do not overlap";
	        }
	    }
}
