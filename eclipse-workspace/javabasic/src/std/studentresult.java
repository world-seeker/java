package std;

import java.util.Scanner;

public class studentresult{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks for 5 subjects:");
        double a,b,c,d,e;
        System.out.println("Enter marks for 1st subjects:");
        a=scanner.nextFloat();
        System.out.println("Enter marks for 2nd subjects:");
        b=scanner.nextFloat();
        System.out.println("Enter marks for 3rd subjects:");
        c=scanner.nextFloat();
        System.out.println("Enter marks for 4th subjects:");
        d=scanner.nextFloat();
        System.out.println("Enter marks for 5th subjects:");
        e=a=scanner.nextFloat();

        double totalMarks = a+b+c+d+e;
        double average = totalMarks / 5;

        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80&&average<=90) {
            grade = 'B';
        } else if (average >= 70&&average<=80) {
            grade = 'C';
        } else if (average >= 50&&average<=70) {
            grade = 'D';
        } else if (average >= 35&&average<=50) {
            grade = 'E';
        } else {
            grade = 'F'; 
        }
        
      
        System.out.println("Average marks: " + average);
        System.out.println("Grade: " + grade);
        scanner.close();
    }
}
