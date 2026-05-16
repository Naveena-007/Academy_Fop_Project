package day08.practice;

public class PrimeNumber {

	public static void main(String[] args) {
	
		 int number = 11;
		    boolean checker = false;
		    for (int i = 2;i <= number /2;i++) {
		     
		      if (number % i == 0) {
		    	  checker = true;
		        break;
		      }	      
		    }
		    if (!checker)
		        System.out.println(number + " is a prime number.");
		      else
		        System.out.println(number + " is not a prime number.");
	}
	
}
