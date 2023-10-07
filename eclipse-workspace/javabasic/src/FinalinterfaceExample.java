import java.util.Scanner;
interface Searchable{

	boolean search(String str);
}


class Webpage implements Searchable{
	
   String value;
   Webpage(String val){
	   this.value=val;
   }
	public boolean search(String str) {
		if(value.contains(str)) {
			return true;
		}
		return false;
	}
	
}

class Document implements Searchable{
	String value;
	Document(String val){
		this.value=val;
	}
	public boolean search(String str) {
		if(value.contains(str)) {
			return true;
		}
		return false;
	}
}

public class FinalInterfaceExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String val;
	    System.out.println("Enter the value to search");
        val = sc.nextLine();
		Webpage web = new Webpage("String one two three");
		boolean seched1=web.search(val);
		System.out.println(seched1);
		
		
		System.out.println("Enter the second value");
		String val2 = sc.nextLine();
		Document doc = new Document("the one two three");
		boolean seched2 = doc.search(val2);
		System.out.println(seched2);
		sc.close();
		
	}

}
