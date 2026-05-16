package fop.day04.practice;

import java.util.Scanner;
public class HandOrientation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read inputs
        String door = scanner.nextLine();
        int rail = scanner.nextInt();

        // Determine handedness based on inputs
        String handedness = determineHandedness(door, rail);

        // Print the result
        System.out.println(handedness);

        scanner.close();
    }

    public static String determineHandedness(String door, int rail) {
        if (door.equals("front")) {
            if (rail == 1) {
                return"Left Handed";
            } else {
                return "Right Handed";
            }
        } else {
            if (rail == 1) {
                return  "Right Handed";
            } else {
                return"Left Handed";
            }
        }
    }
}
