//Java Program to Print an Integer (Entered by the User
import java.util.Scanner;
public class Lab01 {
	
	public static void main(String[] args) {
		
		int input;
		
		Scanner inputObj = new Scanner(System.in);
		
		System.out.println("Enter the integer: ");
		
		input=inputObj.nextInt();
		
		System.out.println("Your number is: " + input);
		
		
	}

}
