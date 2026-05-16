package day04.solved;

public class App {

	public static void main(String[] args){
		
		User user1 = new User();
		user1.setName("Naveena");
		user1.setEmail("Naveena@gmail.com");
		user1.setPhoneNo(9876543210L);
		user1.setPassword("supersecretpassword");
		
		user1.toString();

		User user2 = new User();
		user2.setName("Maha");
		user2.setEmail("Maha@gmail.com");
		user2.setPhoneNo(9876543210L);
		user2.setPassword("highlysecurepassword");
		
		user1.toString();
		
}
}
