class Student1
{
	int rollno;
	String sname,dept;
	static String collegename="ABC";
	Student1(int r,String n,String d)
	{
		rollno=r;
		sname=n;
		dept=d;
	}
	void print_details()
	{
		X(); // accessing the static method within the same class
		System.out.println(rollno+" "+sname+" "+collegename+" "+dept);
	}
	static void X()
	{
		System.out.println("Welcome...");
	}
	static
	{
		System.out.println("Welcome to the program...");
	}
}
public class StaticExmaple 
{

	public static void main(String[] args) 
	{
		Student1 s1=new Student1(100,"AAA","F");
		Student1 s2=new Student1(200,"TTT","G");
		Student1 s3=new Student1(300,"KKK","F");
		s1.print_details();
		s2.print_details();
		s3.print_details();
		Student1.X();  //accessing static method outside the student class
	}

}