package std;

public class Shape {
	
	void perimeter(int a , int b , int c) {
		int perimeterOfTriangle = a + b + c;
		System.out.println("Perimeter Of Triangle: "+perimeterOfTriangle);
			
	}
	void perimeter(int a ) {
		int perimeterOfSquare = 4*a;
		System.out.println("Perimeter Of Square: "+perimeterOfSquare);
	}
	void perimeter(double r) {
		double pi =3.14;
		double perimeterOfCircle = 2*pi*r;
		System.out.println("Perimeter Of circle: "+perimeterOfCircle);
			
	}

	public static void main(String[] args) {
	   
		Shape obj = new Shape();
		obj.perimeter(5.3);
		obj.perimeter(5);
		obj.perimeter(5,6,7);
		
	

	}

}
