
abstract class Subject
{
	Subject(){
		System.out.println("Welcome to the base class");
	}
	
	abstract void syllabus_Learn();//abstract method
	
}

class IT extends Subject{
	void syllabus_Learn()//overridding
	{
		
		System.out.println("C , C++, Java");
	}
}

public class AbstractExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IT ob = new IT();
		ob.syllabus_Learn();
	

	}

}
