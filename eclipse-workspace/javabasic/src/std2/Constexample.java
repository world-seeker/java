package std2;

public class Constexample {

		int x;
		Constexample()  //default constructor
		{
			x=10;
			System.out.println("Hello... Constructor invoked");
		}
		void print_value()
		{
			System.out.println("The value of x is "+x);
		}
		public static void main(String[] args)
		{
			Constexample obj=new Constexample();
			obj.print_value();
			Constexample obj1=new Constexample();
			obj1.print_value();

		}

	}


