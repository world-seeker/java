package collection;
import java.util.*;
import java.util.Map.Entry;




public class Book {
	String bookName;
	String authorName;
	String publisher;
	int quantity;
	
	
	Book(String Bname,String authName,String publisher,int quan){
		
		this.bookName=Bname;
		this.authorName=authName;
		this.publisher=publisher;
		this.quantity=quan;
		
		
	}
	

	public static void main(String[] args) {
		
		Book b1=new Book("redinmartin","xyz","abc",4);
		Book b2=new Book("redin","ccxyz","abccc",4);
	
	  
		HashMap<Integer,Book> bookdetails = new HashMap<>();
		bookdetails.put(1,b1);
		bookdetails.put(2, b2);
	
		for(HashMap.Entry<Integer, Book> entry:bookdetails.entrySet())
	    {    
	        
	        Book b=entry.getValue();  		        
	        System.out.println(b.bookName+" "+b.authorName+" "+b.publisher+" "+b.quantity);   
	    }
		

	}

}
