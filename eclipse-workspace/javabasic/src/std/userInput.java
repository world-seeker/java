package std;
import java.util.Scanner;

public class userInput {

	public static void main(String[] args) {
	   int x,y;
      Scanner sc= new Scanner(System.in);
       System.out.println("ENter a number");
       x=sc.nextInt();
       y=sc.nextInt();
       System.out.println("number is"+x+"and"+y);
       sc.close();
	}

}
