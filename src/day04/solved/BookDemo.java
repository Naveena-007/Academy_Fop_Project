package day04.solved;

public class BookDemo {
	public static void main(String[] args) {
		
		BookDemo newBook = new BookDemo();// create an object 
		System.out.println(newBook); // log an object
		newBook.display(); // here newBook is Object and get value from a normal method 

	}
	
	public void display() {// normal method
		System.out.println("Display Method is invoked");// log an normal method
	}
}
