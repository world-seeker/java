package std;
import java.util.*;

public class itera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Length of Array");
     int n=sc.nextInt();
     int[] x= new int[n];
     System.out.println("Enter array ELements");
 
     for(int i=0;i<n;i++) {
    	 
    	 x[i]=sc.nextInt();
    	
     }
     System.out.println("the values enerd are ");
   for(int i=0;i<x.length;i++) {
	   System.out.println(x[i]);
   }
	
			
		
		

	}

}
