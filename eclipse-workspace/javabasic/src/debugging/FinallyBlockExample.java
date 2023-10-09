package debugging;

public class FinallyBlockExample {

	public static void main(String[] args) {
	  try {
		  int a=50/0;
		  System.out.println("the result is" +a);
	  }catch(Exception e) {
		  System.out.println(e);
	  }finally {
		  System.out.println("Final block");
	  }
		

	}

}
