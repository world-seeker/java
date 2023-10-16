
import java.util.*;

interface Test1{
	void fact(int e);
}
interface Test2{
	void large(int f,int s);
}

public class PipelineExample {

	public static void main(String[] args) {
		
	  
		Test1 rial = (n)->{
            int result=1;	
            for(int i=1;i<=n;i++) {
            	result*=i;
            }
            System.out.println("THe factorial for: "+n+" is "+result);
		};
		
		Test2 largeOf2 = (f,s)->{
			String largest =(f>s)? f+" is larger": s+" is larger";
			System.out.println(largest);
		};
	  rial.fact(5);
	  largeOf2.large(4, 50);
	}
}
