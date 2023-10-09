package debugging;

import java.util.Scanner;


class InvalidAgeException extends Exception
{  
 private static final long serialVersionUID = 1L;

InvalidAgeException(String s)
 {  
  super(s);  
 }  
}  
public class CustomeException
{  
  
   static void validate(int age) throws InvalidAgeException{  
     if(age<18)  
      throw new InvalidAgeException("not valid");  
     else  
      System.out.println("welcome to vote");  
   }  
     
   public static void main(String args[])
   {
	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter your age ");
	   int a=s.nextInt();
	   s.close();
      try
      {  
      validate(a);  
      }
      catch(Exception m)
      {
    	  System.out.println("Exception occured: "+m);
    	  }  
  
      System.out.println("Thank you for using this application.....");  
  }  
}
