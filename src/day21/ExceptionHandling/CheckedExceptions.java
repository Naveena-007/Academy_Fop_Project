package day21.ExceptionHandling;
import java.io.*;
import java.util.*;
public class CheckedExceptions {

 
 
    public static void main(String[] args)
        throws FileNotFoundException
    {
     FileInputStream GFG = null;
 
   
        try {
 
          
            GFG = new FileInputStream(
                "/home/mayur/GFG.txt");
        }
 
       catch (FileNotFoundException e) {
 
      System.out.println("File does not exist");
        }
    }
}