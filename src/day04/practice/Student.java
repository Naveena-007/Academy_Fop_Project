package day04.practice;

public class Student {

	String name;
	String about;
	char section;
	
	
	public static void main (String[] args) {
		// Method One 
		String name = "Naveena sri";
		System.out.println(name);
		
		// Method Two
		Student student  = new Student();
		student.name = "Naveena sri";
		student.about = "Good Girl";
		student.section = 'A';
		student.display();
	}
	
	public void display() {// normal method
		System.out.println(name + " is a "+ about + " She is studing in a "+ section + " class");// log an normal method
	}
}
