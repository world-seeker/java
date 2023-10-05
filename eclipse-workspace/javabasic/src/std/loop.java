package std;

public class loop {

	public static void main(String[] args) {
	
	/*int times=1;
		while(times<=10) {
			if(times==3) 
			continue;
			System.out.println("anudip");
			times++;
			
		}*/
		
	/*	int p=0;
		int number=6;
		int i=2;
		int remainder;
		while(i<number) {
			remainder=number%i;
			if (remainder==0) {
				p=1;
				break;
				
			}i++;
		}
		if(p==0) {
			System.out.println("prime");
			
		}
		else {
			System.out.println("not prime");	
			*/
		int n=28;
		int i=1;
		int s=0;
		int r;
		while(i<6) {
			r=n%i;
			if(r==0)
				s=s+i;
			i++;
		}
		if(s==n) {
			System.out.println("perfect");
		}
		else {
			System.out.println("not perfect");
		}
		
	}

}
