package debugging;
public class ExceptionExample2 {

	public static void main(String[] args) 
	{
		try
		{
	         int a[]=new int[7];
	         a[5]=40/5;
	         System.out.println("the result is "+a[5]); 
	         String s="abc";
	         int x=Integer.parseInt(s);
	         System.out.println(x);
	     }
		
	     catch(ArithmeticException e)
	     {
	        System.out.println("Warning:"+e);
	     }
	     catch(ArrayIndexOutOfBoundsException e)
	     {
	        System.out.println("Warning:"+e);
	     }
		catch(Exception e)
	     {
	         System.out.println("Warning: Some Other exception occured"+e);
	      }
	   System.out.println("Out of try-catch block...");

	}

}