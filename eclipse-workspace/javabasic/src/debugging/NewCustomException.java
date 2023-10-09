package debugging;
import java.util.Scanner;

class OddEven extends Exception {
    private static final long serialVersionUID = 1L;

	OddEven(String s) {
        super(s);
    }
}


public class NewCustomException {
	
    static void validate(int num) throws OddEven {
        if (num % 2 != 0) { 
            throw new OddEven("the number is odd");
        } else {
            System.out.println("even");
        }
    }
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Number: ");
        int a = s.nextInt();
        s.close();

        try {
            validate(a);  
        } catch (OddEven e) {
            System.out.println("Exception: " + e);
        }
    }
}

