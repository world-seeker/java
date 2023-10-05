package std;
import java.util.*;

public class votereligiblity {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Age");
		int a = sc.nextInt();
		//with ternary
		String verifier = (a>=18)?"Eligible":"Not ELIGIBLE";
		System.out.println(verifier);
		//with if else
		/*     if(a>=18){
   	 System.out.println("Eligible");
		}
	else{
		System.out.println("Not ELIGIBLE");
		}*/
		 sc.close();
	}

}
