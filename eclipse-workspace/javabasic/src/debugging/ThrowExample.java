package debugging;

import java.util.*;
public class ThrowExample
{
   static void checkEligibilty(int stuage, int stuweight)
   { 
      if(stuage<12 && stuweight<40) {
         throw new ArithmeticException("Student is not eligible for registration"); 
      }
      else 
      {
         System.out.println("Entries Valid!!"); 
      }
   } 
   
   public static void main(String args[])
   { 
	   Scanner s=new Scanner(System.in);
	   System.out.println("enter the age of the student ");
	   int a=s.nextInt();
	   System.out.println("enter the weight of the student ");
	   int w=s.nextInt();
	   s.close();
     System.out.println("Welcome to the Registration process!!");
     try
     {
    	 checkEligibilty(a,w); 
     }
     catch(Exception e)
     {
    	 System.err.println(e);
     }
    
     System.out.println("Have a nice day.."); 
 } 
}
