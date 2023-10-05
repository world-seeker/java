class Test_A
{
	String s; //attribute or instance variable
	Test_A()// constructor
	{
		s="Hello";
		System.out.println("Parent class constructor");
	}
	void display()//method
	{
		System.out.println("Parent class method");
	}
}

class Test_B extends Test_A
{
	String s; 
	Test_B()
	{
		
		s="welcome";
		System.out.println("Child class constructor");
	}
	void display()
	{
		super.display();
		System.out.println("Child class method");
		System.out.println("The attribute value of parent class is "+super.s);
		System.out.println("The attribute value of child class is "+s);
	}
}
public class SuperExample
{

	public static void main(String[] args) 
	{
		Test_B T=new Test_B();
		T.display();
	

	}

}