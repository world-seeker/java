package debugging;

public class StringException {

	private static String s1;

	public static void main(String[] args) {
		try {
			s1 = null;
			System.out.println(s1.length());
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
			
		}

	}

}
