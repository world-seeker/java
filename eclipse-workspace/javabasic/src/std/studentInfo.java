package std;
import java.util.*;
public class studentInfo {
	
	public static void main(String[] args) {
		 int stAge,stRollnumber,english,hindi,maths,science,history;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student Information");
		System.out.println("Enter student Name");
		String stName=sc.nextLine();
		System.out.println("Enter student Age");
		stAge=sc.nextInt();
		System.out.println("Enter student Rollnumber");
		stRollnumber=sc.nextInt();
		System.out.println("Enter student Marks");
		System.out.println("English");
		english=sc.nextInt();
		System.out.println("Hindi");
		hindi=sc.nextInt();
		System.out.println("Maths");
		maths=sc.nextInt();
		System.out.println("Science");
		science=sc.nextInt();
		System.out.println("History");
		history=sc.nextInt();
		System.out.println("Student Name is "+stName+"\n"
				+"Student Age is "+stAge+"\n"+"Student ROllnumber is"+stRollnumber+"\n"+
				"English marks "+english+"\n"+"maths marks"+maths);
		 sc.close();
	}

}
