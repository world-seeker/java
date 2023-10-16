package collection;

import java.util.*;

public class LambdaExpressionExample2 
{
	public static void main(String[] args)
	{
		
		        List<String> list=new ArrayList<String>();  
		        list.add("ankit");  
		        list.add("Kiran");  
		        list.add("Rahul");  
		        list.add("jai");  
		          
		        /*for(String s:list)
		        {
		        	System.out.println(s);
		        }*/
		        list.forEach(  
		            (n)->System.out.println(n)  
		        );  
		    }  
		}