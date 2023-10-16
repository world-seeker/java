package collection;

interface Test
{
	void display();
}

/*class BB implements Test
{
	public void display()
	{
		
	}
}*/

/*class HH implements Test
{
	public void display()
	{
		
	}
}*/
public class TestLambda
{
	public static void main(String [] args)
	{
		/*Test ob=new Test() {
			public void display()
			{
				System.out.println("Hello..");
			}
		};
		ob.display();
		
		Test ob1=new Test() {
			public void display()
			{
				System.out.println("Welcome..");
			}
		};
		ob1.display();*/
		Test ob=()->System.out.println("Hello..");
		ob.display();
		Test ob1=()->System.out.println("Welcome..");
		ob1.display();
	}
	
	}