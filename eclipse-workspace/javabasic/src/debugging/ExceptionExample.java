package debugging;
import java.util.Scanner;
public class ExceptionExample {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter two number");
		a=sc.nextInt()
;
		b=sc.nextInt();
		c=a-b;
		sc.close();
		
	try {
		if(c!=0) {
			System.out.println("the result is "+a/c);
		}
		else {
			System.out.println("the result is "+b/c);
		}
	}catch(ArithmeticException e) {
//		System.err.println("Error occured!!!");
//		System.err.println("Do not ENter Same number");
		System.err.println(e.getMessage());
	
	}
		
		
	}

}
