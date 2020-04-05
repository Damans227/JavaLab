//Java Program to Calculate the Sum of Natural Numbers

/*The positive numbers 1, 2, 3... are known as natural
 *  numbers and its sum is the result of all numbers starting 
 *  from 1 to the given number.
 *  
 *  program loops from 1 to the given num(100) and adds all 
 *  numbers to the variable sum.
 */

import java.util.Scanner;
public class Lab14 {

	public static void main(String[] args) {
		
		int counter, sum=0;
		
		System.out.println("Enter the counter value: ");
		
		Scanner sc=new Scanner(System.in);
		
		counter=sc.nextInt();
		
		if (counter>0) {
			
			for(int i=1; i<=counter ;i++) {
				
				
				
				sum= sum+i; 
				
				
			}
			System.out.println("Sum =  " + sum); 		
		}else {
			
			
			System.out.println("Enter counter greater than 0: ");
			
		}
		
		
		
	}
}
