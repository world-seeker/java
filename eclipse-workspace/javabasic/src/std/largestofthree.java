package std;
import java.util.*;
public class largestofthree {

	public static void main(String[] args) {
	int a,b,c;
	    
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter three numbers");
	   System.out.println("Enter the first numbers");
	   a = sc.nextInt();
	   System.out.println("Enter the second numbers");
	   b= sc.nextInt();
	   System.out.println("Enter the third numbers");
	   c=sc.nextInt();
	   
	   if(a>b) {
		   if(a>c) {
			   System.out.println(a+" is the largest");
		   }
		   else {
			   System.out.println(c+"is the largest");   
		       }
		  
	   }
	   else {
		   if(b>c) {
			   System.out.println(b+" is the largest ");
		          }
		   else {
			   System.out.println(c+" is the largest");
		   }
		   sc.close();
	   }	  
	}
}
