package std;
import java.util.*;

public class ifexample {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		if(a%5==0) {
			System.out.println(a+" is Divisible by 5");
		}
		else{
			System.out.println(a+" Not Divisible by 5");
		}
		 sc.close();
	}

}
