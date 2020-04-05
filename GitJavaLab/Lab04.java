//Java Program to Find ASCII Value of a character
import java.util.Scanner;
public class Lab04 {
	
	public static void main(String[] args) {
		char ch;
		int convert;
		
		Scanner inputObj = new Scanner(System.in);
		
		System.out.println("Enter the Character to convert: ");
		
		ch = inputObj.next(".").charAt(0);
		
		convert = ch; 
		
		System.out.println("Here is your ASCII Character: " + convert);
	}

}
