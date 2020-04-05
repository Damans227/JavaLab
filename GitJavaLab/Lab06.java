//Java Program to Swap Two Numbers

import java.util.Scanner;
public class Lab06 {
	
	public static void main(String[] args) {
		
		float num1,num2,temp;
		
		Scanner inputObj=new Scanner(System.in);
		
		System.out.println("Enter first number to be swapped: ");
		
		num1=inputObj.nextFloat();
		
		System.out.println("Enter second number to be swapped: ");
		
		num2=inputObj.nextFloat();
		
		System.out.println("First Number:  " + num1 + " & your Second Number: " + num2);
		
		temp=num1;
		num1=num2;
		
		System.out.println("First Number:  " + num1 + " & your Second Number: " + temp);
	}

}
