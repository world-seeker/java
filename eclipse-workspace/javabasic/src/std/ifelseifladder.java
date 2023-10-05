package std;
import java.util.*;

public class ifelseifladder {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a>b&&a>c) {
		     System.out.println(a+" is  largest");	
		}
		else if(b>a&&b>c) {
		    System.out.println(b+" is  largest");
		}
		else {
		    System.out.println(c+" is  largest");
		}
		 sc.close();
	    
	}
}
