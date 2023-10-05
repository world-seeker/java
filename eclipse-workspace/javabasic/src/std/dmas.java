package std;
import java.util.Scanner;

public class dmas {

	  public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

		  int a,b;
		    System.out.println("Enter number 1");
		  a=sc.nextInt();
		    System.out.println("Enter number 2");
		  b=sc.nextInt();
		    System.out.println("Enter the operator");
		  char s =sc.next().charAt(0);
		  
		 if(s=='*') {
			 System.out.println((a*b));
		 }
		 else if(s=='+') {
			 System.out.println((a+b));
		 }
		 else if(s=='/') {
			 System.out.println((a/b));
		 }
		 else if(s=='-') {
			 System.out.println((a-b));
		 }
		 else {
			 System.out.println("invalid operator");	 
		 }
			  
		 sc.close();
		  
		  
	  }
	
}
