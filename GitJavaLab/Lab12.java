//Java Program to Check Whether a Number is Positive or Negative

import java.util.Scanner;
public class Lab12 {
	
	public static void main(String[] args) {
	double num1;
	
	System.out.println("Enter the number to check: ");
	
	Scanner sc = new Scanner(System.in);
	num1=sc.nextDouble();
	
	if(num1<0) {
		
		System.out.println("It's a negative number");
		
	}else if (num1>0){
		
		System.out.println("It's a positive number");
	}
	else {
		
		System.out.println("It's a zero");
	}
}
}