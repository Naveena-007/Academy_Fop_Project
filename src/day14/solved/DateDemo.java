package day14.solved;

import java.time.LocalDate;
import java.time.LocalDateTime;
//old version
//import java.util.Date;


public class DateDemo {

	public static void main(String[] args) {
// old version	
//		Date date = new Date();
//		System.out.println(date);		
		
		LocalDate today = LocalDate.now();
	  System.out.println(today);
	  
	  LocalDateTime now = LocalDateTime.now();
	  System.out.println(now);

	}

}