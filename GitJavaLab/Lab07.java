//Java Program to Check Whether a Number is Even or Odd
import java.util.Scanner;
public class Lab07 {
	public static void main(String[] args) {
		
	float input;
	
	Scanner inputObj = new Scanner(System.in);
	
	System.out.println("Enter your number to be checked: ");
	input=inputObj.nextFloat();
	
	if(input%2 == 0f) {
		
		System.out.println("Number entered is EVEN ");
		
	} else{
		
		System.out.println("Number entered is ODD ");
	}
	
	}
}
