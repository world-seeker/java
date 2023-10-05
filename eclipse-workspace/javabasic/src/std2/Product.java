package std2;
import java.util.*;

class Product{
	int productId;
	String productName;
	double productPrice;
	
	public Product(int id,String name,double price) {
		System.out.println("Inside the constructor");
		productId=id;
		productName = name;
		productPrice = price;
		
	}
	
	public static void main(String[] args ) {
		
		Product items = new Product(0,"",0.00);
		Scanner sc = new Scanner(System.in);
		
	   
	}
	
	
}
	
	
