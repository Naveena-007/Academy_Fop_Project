package fop.day02.inClass;
import java.util.Scanner;
public class RowCol {

	public RowCol() {
		// TODO Auto-generated constructor stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
	    int num = sc.nextInt();
	    
	    int row = (num - 1) /3 ; 
	    int col = (num - 1) % 3 ;
	    
	    
	    System.out.print(row +" " +col);
	}

}
