package day06.practice;

public class Seperate {

	public static void main(String[] args) {
		String name = "Jane Doe";
		
		String[] nameParts = name.split(" ");
	    String firstName = nameParts[0];
	    String lastName = nameParts[1];

	    System.out.println("First Name : " + firstName);
	    System.out.println("Last Name : " + lastName);
	}
}
