
class Demo
{
	int a;
	float b;
	Demo()
	{
		System.out.println("Welcome to demo class ");
	}
	Demo(int a,float b)
	{
		this();
		this.a=a;
		this.b=b;
	}
	void display()
	{
		System.out.println("The value of a is "+a+" and the value of b is "+b);

		}

}
public class ThisExample 
{

	public static void main(String[] args) 
	{
		Demo d1=new Demo(300,20.5f);
		d1.display();
		

	}

}