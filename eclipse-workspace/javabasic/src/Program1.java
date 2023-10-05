
public class Program1 {
	int rollno;
	String name;
	final int std= 12;
	public Program1(int rollno,String name){
		
		this.rollno=rollno;
		this.name=name;
		
		
	}
	 void display() {
		 show();
		System.out.println("Name: "+name+" \n"+"Rollno: "+rollno+" Std: "+std);
	}
	
	static void show()
	{
		System.out.println("Welcome...");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Program1 myf = new Program1(22,"Swapnil");
         myf.display();
         Program1 myf1 = new Program1(22,"pranam");       
         myf1.display();
		
	}

}
