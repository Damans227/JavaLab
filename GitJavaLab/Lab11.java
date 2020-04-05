//Java Program to Check Leap Year 

/*A leap year is exactly divisible by 4 except for century years (years ending with 00). 
 The century year is a leap year only if it is perfectly divisible by 400.*/

import java.util.Scanner;
public class Lab11 {
	public static void main(String[] args) {
	int year;
	
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter the Year you want to check: ");
	year=sc.nextInt();
	
	if(year%4==0) {
		
		if(year%100==0) {
			
			if(year%400==0) {
				
				
				System.out.println("YES, it's a LEAP YEAR ");
				
			} else {
				
				System.out.println("NO, it's not a LEAP YEAR ");
			
			}
		} else {
			
			System.out.println("YES, it's a LEAP YEAR ");
			
		}
		
	}
	
	else {System.out.println("NO, it's not a LEAP YEAR ");}
}
}