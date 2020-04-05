//Java Program to Compute Quotient and Remainder
import java.util.Scanner;
public class Lab05 {
	
	public static void main(String[] args) {
		
	float num1,num2,result, remainder;
	
	Scanner inputObj= new Scanner(System.in);
	
	System.out.println("Enter your number 1: ");
	
	num1=inputObj.nextFloat();
	
	System.out.println("Enter your number 2: ");
	
	num2=inputObj.nextFloat();
	
	result = num1/num2;
	remainder=num1%num2;
	
	System.out.println("Your Quotient: " + result + "& Your Remainder: " + remainder );
	
	}
}
