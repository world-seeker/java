package std;

class A
{
	 int a;
	 void display_a()
	{
		a=100;
		System.out.println(a);
	}
}

class B
{
	int x;
	void display_x()
	{
		x=200;
		System.out.println(x);
	}
}

public class HelloClass {

	public static void main(String[] args)
	{
		A obj1=new A();
		obj1.display_a();
		B ob2=new B();
		ob2.display_x();

	}

}
