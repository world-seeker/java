package std;

import java.util.Scanner;

public class sumavg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter five numbers");
          float a,b,c,d,e,f;
          a=scanner.nextFloat();
          b=scanner.nextFloat();
          c=scanner.nextFloat();
          d=scanner.nextFloat();
          e=a=scanner.nextFloat();
          scanner.close();
          float sum=a+b+c+d+e;
         double average = sum/5;
        System.out.println("The sum of the five numbers is: " + sum +" Average is "+average);
       
    }
}
