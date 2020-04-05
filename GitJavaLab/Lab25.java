//Java Program to Check Whether a Number is Prime or Not

import java.util.Scanner; 

public class Lab25 {
	
	static int num;
	static boolean value;
	static boolean flag = false;
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number you'd like to check: ");
		
		num=sc.nextInt();
		
		value=Prime();
		
		if (!value) {
			
			System.out.println("This is a prime number");
		} else {
			
			System.out.println("This is not a prime number");
		}
		
		
	}
	
	public static boolean Prime() {
		
		for(int i=2;i<=num/2;i++) {
			
			if(num%i==0) {
				
				flag = true; // condition for non prime
				break;
			} 
			
		} return flag;
		
	}

}
