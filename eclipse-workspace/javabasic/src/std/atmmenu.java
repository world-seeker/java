package std;
import java.util.*;
public class atmmenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	       int a =5000;
	       System.out.println("1.Withdraw\n2.Deposit\n3.Balance Enquiry\n4.Exit");
	       int choice = sc.nextInt();
	       switch(choice){
	       case 1 :
	    	   System.out.println("Enter withdraw amount");
	    	   int w=sc.nextInt();
	    	   System.out.println("balance is :"+(a-w));
	    	   break;
	       case 2 :   
	    	   System.out.println("Enter Deposit amount");
	    	   int d=sc.nextInt();
	    	   System.out.println("balance is : "+(a+d));
	    	   break;
	       case 3 :   
	    	   System.out.println("Balance is :"+a);
	    	   break;
	       case 4:
	    	   System.exit(0);
	    	   break;
	    	default:
	    		System.out.println("invalid input");
	    		
	    	   sc.close();
	       }

	  }

}
