package std;
import java.util.*;

public class nestedIfexample {

	public static void main(String[] args) {
		int pwd;
	   Scanner sc = new Scanner(System.in);//input stream
	   System.out.println("Enter the user name");//output stream message
	   String user= sc.next();//takes username as input
	   if(user.equals("ADMIN")||user.equals("admin"))
	   {
			//first  condition block
		   System.out.println("Enter the Password");
		   pwd = sc.nextInt();//takes password as input
		   
		  if(pwd==123){
		  //nested if condition, only executes if the above condition is true
			   System.out.println("Login Success");
		       }
		   else{
			   
			   System.out.println("Incorrect Password ");
		       }	  
	      }
	   else
	      {
		   System.out.println("Incorrect username ");
	      }
	   sc.close();
	}

}
