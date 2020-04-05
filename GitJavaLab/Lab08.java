//Java Program to Check Whether an Alphabet is Vowel or Consonant

import java.util.Scanner;
public class Lab08 {
	 public static void main(String[] args) {
		
	char in;
		 
	Scanner inputObj=new Scanner(System.in);

	System.out.println("Enter a single character: ");
	
	in=inputObj.next(".").charAt(0);
	
	if (in == 'a'|| in == 'e'|| in == 'i'|| in == 'o'|| in == 'u' ) {
		
		System.out.println("It's a vowel");
		
		
	}else {  
		
		
		System.out.println("It's not a vowel");
	}	 
		 
	 }

}
