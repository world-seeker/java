package std;
import java.util.*;

public class podtiveornegative {

	  public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in); 
		  System.out.println("Enter a number");
		  int a = sc.nextInt();
		  if(a<=0) {
			  
			  if(a==0) {
				  System.out.println("Neither positive nor negative"
				  		+ "");
			  }
			  else {
				  System.out.println(a+ " number is negative");
			  }
		  }
		
		  else {
			  System.out.println(a +"number is positive");
		  }
		  sc.close();
	  }
	
	
	
}
