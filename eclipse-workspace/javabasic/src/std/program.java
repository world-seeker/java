package std;

import java.lang.reflect.Array;

public class program {

	public static void main(String[] args) {
	   
		
		//Program to find the greatest number in an array
        /*   int arr[]= {1,2,32,4,5};
           int largest = arr[0];
           for(int i=0;i<=4;i++){
        	 
        	  if(arr[i]>largest) {
        		  largest = arr[i];
        	  }
        	  
           }
           System.out.println(largest);*/
		
	
		        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		        int primeHolder = 0;

		        for (int i = 0; i < arr.length; i++) {
		            if (arr[i] > 1) {  // Prime numbers are greater than 1
		                boolean isPrime = true;

		                for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
		                    if (arr[i] % j == 0) {
		                        isPrime = false;
		                        break;  // If a divisor is found, it's not prime, so exit the loop
		                    }
		                }

		                if (isPrime) {
		                    primeHolder = arr[i];
		                }
		            }
		        }

		        if (primeHolder == 0) {
		            System.out.println("No prime numbers found in the array.");
		        } else {
		            System.out.println("The largest prime number in the array is: " + primeHolder);
		        }
		    }
		}

			  
			  
		
		   
	        
