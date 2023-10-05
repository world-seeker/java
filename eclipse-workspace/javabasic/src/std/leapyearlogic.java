package std;
import java.util.*;
public class leapyearlogic {
	
	public static void main(String[] args) {
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter year");
		year= sc.nextInt();
		
	/*	if(year%4==0) {
		      if(year%100==0) {
		    	  if(year%400==0) {
		    		  System.out.println(year+" is a leap year");
		    	  }
		    	  else {
		    		  System.out.println(year+" Not a leap year");  
		    	  }
		      }
		      else {
		    	  System.out.println(year+" leap year");
		      }
		}
		else {
			  System.out.println(year+" not a leap year");
		}
		*/	
		if(year%4==0&&year%100==0||year%400==0) {
			System.out.println(year+" leap year");
		}
		else {
			System.out.println(year+" Not a leap year");
		}
		 sc.close();
		
    }
			
	}


